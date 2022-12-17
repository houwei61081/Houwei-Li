import java.util.ArrayList;
import java.util.Optional;

import javax.lang.model.util.ElementScanner6;
import javax.security.auth.callback.ChoiceCallback;
import javax.swing.Action;
import javax.swing.plaf.LabelUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class game extends javafx.application.Application{
    static boolean isStart = false;     //是否开始
    static TextArea gameArea;       //游戏区域
    static Enemy  enemy = null;
    static Heros hero = null;
    static Player player = null;

    Button buttonEquip;
    Button buttonProperties;     //查看装备，查看属性,攻击
    Button buttonEntez;
    Button buttonChoixHeros;
    Button buttonActoin ,buttonCommencez;
    private Node[] newWindowBtn;
    private Button buttonHeroChoose;
    private Button buttonItem;
    private Button buttonAction;
    private Button buttonCommencezgame;
    private Region buttonStartround;
    private ButtonBase buttonEnter;

    static ArrayList<String> heroList = new ArrayList<>();      //英雄列表
    static ArrayList<String> monsterList = new ArrayList<>();    //怪兽列表
    static ArrayList<String> allList = new ArrayList<>();       //总共列表

    static Hunter hunter = null;
    static Warrior warrior = null;
    static Mage mage = null;
    static Healer healer = null;

    static Enemy Enemy1 = null;
    static Enemy Enemy2 = null;
    static Enemy Enemy3 = null;
    static Enemy Enemy4 = null;

    public static void main(String[] args) { 
        Application.launch(args);	// 启动独立的JavaFx程序
    }
    
    public void start(Stage premierStage) throws Exception {
        BorderPane rootPane = new BorderPane(); 
        rootPane.setPadding(new Insets(10));   
        gameArea = new TextArea();
        gameArea.setEditable(false);    
        gameArea.setStyle("-fx-background-color:red;-fx-text-fill:blue;");      //红色边框，蓝色字体
        gameArea.setWrapText(true);    

        Font font = new Font("Cambria",50);     
        gameArea.setFont(font);
        gameArea.appendText("\n\t BONJOUR! BIENVENUE AU JEU Mini RPG  ");
        rootPane.setTop(gameArea);
        GridPane controlPane = new GridPane();
		controlPane.setAlignment(Pos.CENTER);
		controlPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		controlPane.setHgap(5.5);
		controlPane.setVgap(5.5);
		
		
            // 创建一个包含按钮的APP
        Button newWindowBtn = new Button("ENTREZ");
    
            // 为按钮添加事件——点击时打开新的窗口
        newWindowBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
    
                    // 创建新的stage
                Stage secondStage = new Stage();
                Label label = new Label("ON PEUT COMMENCEZ LE JEU MAINTENANT!"); // 放一个标签
                StackPane secondPane = new StackPane(label);
                Scene secondScene = new Scene(secondPane, 300, 200);
                secondStage.setScene(secondScene);
                secondStage.show();
                premierStage.close();
                Font font1 = new Font("Cambria", 40);
                gameArea.setFont(font);
            }
        });
            BorderPane rootPane1 = new BorderPane(); 
            rootPane1.setPadding(new Insets(10)); // 边缘内侧空白距离
            gameArea = new TextArea();
            gameArea.setEditable(false);	// 不可修改
            gameArea.setPrefSize(800, 350); // 游戏画面大小
            gameArea.setStyle("-fx-background-color:red;-fx-text-fill:blue;");
            gameArea.setWrapText(true);	// 自动换行
           


            GridPane controlPane1 = new GridPane();
            controlPane1.setAlignment(Pos.CENTER);
            controlPane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            controlPane1.setHgap(5.5);
            controlPane1.setVgap(5.5);
    
            //设置左侧按钮的位置参数
            int helpRowNumNum1 = 4;
            int buttonWidth1 = 100;       //按钮的宽
            int buttonHeight1 = 80;
            
            buttonHeroChoose = new Button("CHOIX DE VOTRE HEROS");
            buttonHeroChoose.setPrefSize(buttonWidth1, buttonHeight1);
            controlPane1.add(buttonHeroChoose, helpRowNumNum1+2,1); 

            rootPane1.setLeft(controlPane1); //pour etre sur le buton soit aà gauche
            
            GridPane operationPane = new GridPane();
            operationPane.setAlignment(Pos.CENTER);
            operationPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            operationPane.setHgap(5.5);
            operationPane.setVgap(5.5);

            int helpRowNumNum2 = 14;
            int buttonWidth2 = 160;
            int buttonHeight2 = 50;

            buttonItem = new Button("AFFICHER LES OBJETS");
            buttonItem.setPrefSize(buttonWidth2, buttonHeight2);
            operationPane.add(buttonItem,helpRowNumNum2+0,1);
    
            //属性按钮
            buttonProperties = new Button("AFFICHER LES PROPRITES");
            buttonProperties.setPrefSize(buttonWidth2, buttonHeight2);
            operationPane.add(buttonProperties,helpRowNumNum2+3,1);
    
            //行动按钮
            buttonAction = new Button(" ACTION");
            buttonAction.setPrefSize(buttonWidth2, buttonHeight2);
            operationPane.add(buttonAction, helpRowNumNum2+0,3);

            buttonCommencezgame = new Button("COMMENCEZ ");
            buttonCommencezgame.setPrefSize(buttonWidth2, buttonHeight2);
            operationPane.add(buttonCommencezgame,helpRowNumNum2+3,3);
 
            rootPane.setCenter(operationPane);      //确认操作面板在rootPane的右边

            buttonEnter.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    StartGame();        //开始游戏
                }

                private void StartGame() {
                }
                
            });

            buttonHeroChoose.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {

                    if(isStart) {
                        System.out.println("Hero choose");       //检查器
                        StringBuilder herochooBuilder1 = new StringBuilder();
                        TextInputalwaysDialog herochoosDialog = new TextInputalwaysDialog();
                        herochooBuilder1.append("\n\n How many heros do you want to choose?");
                        herochooBuilder1.append(herochoosDialog.getText());
                        gameArea.appendText(herochooBuilder1+"");


                        int NC = Integer.parseInt(herochoosDialog.getText());
                        if (NC == 1){
                            System.out.println("vous avez choisi un héros ");
                            EnemyList.add("Monster1");
                            allList.add("Monster1");

                            heroclass1();
                            TextInputalwaysDialog heroclass1Dialog = new TextInputalwaysDialog();
                            StringBuilder heroclass1Builder = new StringBuilder();
                            int HClass1 = Integer.parseInt(heroclass1Dialog.getText());

                            switch(HClass1){
                                case 1:
                                    System.out.println("Warrior");
                                case 2 :
                                    System.out.println("Hunter");
                                case 3:
                                    System.out.println("Mage");
                                case 4:
                                    System.out.println("Healer");
                                default:
                                    System.out.println("Erreur");
                                    heroList.add("Warrior");
                                    allList.add("Warrior");
                                    heroList.add("Mage");
                                    allList.add("Mage");
                                    heroList.add("Healer");
                                    allList.add("Healer");
                            }
                                gameArea.appendText(heroclass1Builder+"");
                            
                        }else if (NC == 2){
                            System.out.println("You choose to have 2 heros.");
                            monsterList.add("Enemy1");
                            monsterList.add("Enemy2");
                            allList.add("Enemy1");
                            allList.add("Enemy2");

                            heroclass1();
                            TextInputalwaysDialog heroclass2Dialog = new TextInputalwaysDialog();
                            StringBuilder heroclass2Builder = new StringBuilder();
                            int HClass1= Integer.parseInt(heroclass2Dialog.getText());

                            switch(HClass1){
                                case 1:
                                    System.out.println("Warrior");
                                case 2 :
                                    System.out.println("Hunter");
                                case 3:
                                    System.out.println("Mage");
                                case 4:
                                    System.out.println("Healer");
                                default:
                                    System.out.println("Erreur");
                                    heroList.add("Warrior");
                                    allList.add("Warrior");
                                    heroList.add("Mage");
                                    allList.add("Mage");
                                    heroList.add("Healer");
                                    allList.add("Healer");
                                }
                                gameArea.appendText(heroclass1Builder+"");

                                heroclass2();
                                TextInputalwaysDialog heroclass2Dialog = new TextInputalwaysDialog();
                                StringBuilder heroclass2Builder = new StringBuilder();
                                int HClass2 = Integer.parseInt(heroclass2Dialog.getText());

                                switch(HClass2){
                                    case 1:
                                        System.out.println("Warrior");
                                    case 2 :
                                        System.out.println("Hunter");
                                    case 3:
                                        System.out.println("Mage");
                                    case 4:
                                        System.out.println("Healer");
                                    default:
                                        System.out.println("Erreur");

                                        heroList.add("Warrior");
                                        allList.add("Warrior");
                                        heroList.add("Mage");
                                        allList.add("Mage");
                                        heroList.add("Healer");
                                        allList.add("Healer");
                                    }
                                    gameArea.appendText(heroclass2Builder+"");

                            }else if(NC == 3);
                                System.out.println("You choose to have 3 heros.");
                                monsterList.add("Enemy1");
                                monsterList.add("Enemy2");
                                monsterList.add("Enemy3");
                                allList.add("Enemy1");
                                allList.add("Enemy2");
                                allList.add("Enemy3");


                            }

                        }
                            



                        


                    

        }
    }

                private void heroclass2() {
                }

                private void heroclass1() {
                }
        }
    }
    

    
 

