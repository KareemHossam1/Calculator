package calculator;
// Packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Calculator extends Application {
    double num1=0,num2=0,sum=0,i=0; // Double variables we will need in calculation
    boolean plusIsSelected= false, subtractIsSelected=false,multiplyIsSelected=false,devideIsSelected=false,writeFirstNum=true,firstCalc= true; // Boolean variables we will need in showing results
    @Override
    public void start(Stage primaryStage) {
        // Creating elements an ordering them on the scene
        TextField text = new TextField("0");           // Create a text field
        text.setPrefWidth(280);                        // Set text field width
        text.setEditable(false);                       // To prevent the user from entering string inputs
        HBox textH = new HBox();                       // put the text field in a HBox to
        textH.getChildren().add(text);                 // add text field to the text field
        textH.setPadding(new Insets(10,10,0,10));      // set the position
        Font font = new  Font(20);                     // add a font
        // Creating Buttons
        // each point has the same properties
        // first line : creating button and setting its name
        // second line : setting button's font
        // third line : setting button size
        Button btn1 = new Button("1");
        btn1.setFont(font);
        btn1.setPrefSize(70,70);
        Button btn2 = new Button("2");
        btn2.setFont(font);
        btn2.setPrefSize(70,70);
        Button btn3 = new Button("3");
        btn3.setFont(font);
        btn3.setPrefSize(70,70);
        Button btn4 = new Button("4");
        btn4.setFont(font);
        btn4.setPrefSize(70,70);
        Button btn5 = new Button("5");
        btn5.setFont(font);
        btn5.setPrefSize(70,70);
        Button btn6 = new Button("6");
        btn6.setFont(font);
        btn6.setPrefSize(70,70);
        Button btn7 = new Button("7");
        btn7.setFont(font);
        btn7.setPrefSize(70,70);
        Button btn8 = new Button("8");
        btn8.setFont(font);
        btn8.setPrefSize(70,70);
        Button btn9 = new Button("9");
        btn9.setFont(font);
        btn9.setPrefSize(70,70);
        Button btn0 = new Button("0");
        btn0.setFont(font);
        btn0.setPrefSize(70,70);
        Button btnC = new Button("C");
        btnC.setFont(font);
        btnC.setPrefSize(70,70);
        Button btnEqual = new Button("=");
        btnEqual.setFont(font);
        btnEqual.setPrefSize(70,70);
        Button btnPlus = new Button("+");
        btnPlus.setFont(font);
        btnPlus.setPrefSize(70,70);
        Button btnSubtract = new Button("-");
        btnSubtract.setFont(font);
        btnSubtract.setPrefSize(70,70);
        Button btnMultiply = new Button("*");
        btnMultiply.setFont(font);
        btnMultiply.setPrefSize(70,70);
        Button btnDevide = new Button("/");
        btnDevide.setFont(font);
        btnDevide.setPrefSize(70,70);
        // put every 4 buttons in HBox
        HBox hbox1 = new HBox(5);
        hbox1.getChildren().addAll(btnC,btn0,btnEqual,btnDevide);
        HBox hbox2 = new HBox(5);
        hbox2.getChildren().addAll(btn1,btn2,btn3,btnMultiply);
        HBox hbox3 = new HBox(5);
        hbox3.getChildren().addAll(btn4,btn5,btn6,btnSubtract);
        HBox hbox4 = new HBox(5);
        hbox4.getChildren().addAll(btn7,btn8,btn9,btnPlus);
        // put elements in VBox to set the scene
        VBox vbox0 = new VBox(5);
        vbox0.getChildren().addAll(hbox4,hbox3,hbox2,hbox1);
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(textH,vbox0);
        // Buttons event handler
        // every number button has the same event handler
        // first line : creating event handler
        // second line : set the counter to 0
        // third line : if statement to do the code if it's the first digit of the number
        // fourth line : setiing the text field text to the number
        // fifth line : make the boolean variable = false to enable the user from entering the secon digit
        // seventh line : if the user doesn't enter the first digit then add the digit to the number
        btn1.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("1");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"1");
        });
        btn2.setOnAction(e->{if(writeFirstNum){
                i=0;
                text.setText("2");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"2");  
            });
        btn3.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("3");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"3");
        });
        btn4.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("4");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"4");
        });
        btn5.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("5");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"5");
        });
        btn6.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("6");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"6");
        });
        btn7.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("7");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"7");
        });
        btn8.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("8");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"8");
        });
        btn9.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("9");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"9");
        });
        btn0.setOnAction(e->{
            i=0;
            if(writeFirstNum){
                text.setText("0");
                writeFirstNum=false;}
            else
                text.setText(text.getText()+"0");
        });
        // event handler for c button to reset variables and text field text
        btnC.setOnAction(e->{
            text.setText("0");
            num1=0;
            num2=0;
            sum=0;
            i=0;
            plusIsSelected= false;
            subtractIsSelected=false;
            multiplyIsSelected=false;
            devideIsSelected=false;
            writeFirstNum=true;
            firstCalc= true;
        });
        /* Event handler for operators buttons
        *  first line : when the user clicks on the operator increase the counter 
        *  second line : if it's first click
        *  third line : if it's first operation
        *  fourth line : get the number
        *  fifth line : add the number to sum
        *  sixth line : print sum 
        *  seventh line : it's no longer the first calc 
        *  rest lines are for calculating sum if it isn't the first calc . The code is explained in equal button part */
        btnPlus.setOnAction(e->{
            i++;
            if(i==1){
                if (firstCalc){
                    num1=Double.valueOf(text.getText());
                    sum+=num1;
                    text.setText(String.valueOf(sum));
                    firstCalc=false;
                    }
                if (plusIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum+=num2;
                    text.setText(String.valueOf(sum));
                    plusIsSelected=false;}
                if (subtractIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum-=num2;
                    text.setText(String.valueOf(sum));
                    subtractIsSelected=false;}
                if (multiplyIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum*=num2;
                    text.setText(String.valueOf(sum));
                    multiplyIsSelected=false;}
                if (devideIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum/=num2;
                    text.setText(String.valueOf(sum));
                    devideIsSelected=false;}
                }
                plusIsSelected=true;
                writeFirstNum=true;
                    });
        btnSubtract.setOnAction(e->{
            i++;
            if(i==1){
                if (firstCalc){
                    num1=Double.valueOf(text.getText());
                    sum+=num1;
                    text.setText(String.valueOf(sum));
                    firstCalc=false;
                    }
                if (plusIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum+=num2;
                    text.setText(String.valueOf(sum));
                    plusIsSelected=false;}
                if (subtractIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum-=num2;
                    text.setText(String.valueOf(sum));
                    subtractIsSelected=false;}
                if (multiplyIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum*=num2;
                    text.setText(String.valueOf(sum));
                    multiplyIsSelected=false;}
                if (devideIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum/=num2;
                    text.setText(String.valueOf(sum));
                    devideIsSelected=false;}
                }
        subtractIsSelected=true;
        writeFirstNum=true;
        });
        btnMultiply.setOnAction(e->{
            i++;
            if(i==1){
                if (firstCalc){
                    num1=Double.valueOf(text.getText());
                    sum+=num1;
                    text.setText(String.valueOf(sum));
                    firstCalc=false;
                    }
                if (plusIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum+=num2;
                    text.setText(String.valueOf(sum));
                    plusIsSelected=false;}
                if (subtractIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum-=num2;
                    text.setText(String.valueOf(sum));
                    subtractIsSelected=false;}
                if (multiplyIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum*=num2;
                    text.setText(String.valueOf(sum));
                    multiplyIsSelected=false;}
                if (devideIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum/=num2;
                    text.setText(String.valueOf(sum));
                    devideIsSelected=false;}
                }
        multiplyIsSelected=true;
        writeFirstNum=true;
        });
        btnDevide.setOnAction(e->{
            i++;
            if(i==1){
                if (firstCalc){
                    num1=Double.valueOf(text.getText());
                    sum+=num1;
                    text.setText(String.valueOf(sum));
                    firstCalc=false;
                    }
                if (plusIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum+=num2;
                    text.setText(String.valueOf(sum));
                    plusIsSelected=false;}
                if (subtractIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum-=num2;
                    text.setText(String.valueOf(sum));
                    subtractIsSelected=false;}
                if (multiplyIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum*=num2;
                    text.setText(String.valueOf(sum));
                    multiplyIsSelected=false;}
                if (devideIsSelected){
                    num2=Double.valueOf(text.getText());
                    sum/=num2;
                    text.setText(String.valueOf(sum));
                    devideIsSelected=false;}
                }
        devideIsSelected=true;
        writeFirstNum=true;
        });
        // Equal button event handler
        // if statement foe each operator to make the calculations
        btnEqual.setOnAction(e->{
        if (plusIsSelected){
            num2=Double.valueOf(text.getText());
            sum+=num2;
            text.setText(String.valueOf(sum));
            plusIsSelected=false;}
        if (subtractIsSelected){
            num2=Double.valueOf(text.getText());
            sum-=num2;
            text.setText(String.valueOf(sum));
            subtractIsSelected=false;}
        if (multiplyIsSelected){
            num2=Double.valueOf(text.getText());
            sum*=num2;
            text.setText(String.valueOf(sum));
            multiplyIsSelected=false;}
        if (devideIsSelected){
            num2=Double.valueOf(text.getText());
            sum/=num2;
            text.setText(String.valueOf(sum));
            devideIsSelected=false;}
        text.setText(String.valueOf(sum));   // Print the result
        writeFirstNum=true;   // enable the user from entering the first digit of the new number
        });
        // Adding scene and primary stage
        Scene scene = new Scene(vbox, 283, 300);  // adding scene and setting its size
        primaryStage.setResizable(false);     // to prevent the user from resizing the window
        primaryStage.setTitle("Calculator");  // Window title
        primaryStage.setScene(scene);  // adding scene to the primary stage
        primaryStage.show();  // show the primary stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}