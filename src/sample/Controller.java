package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.TableView;

public class Controller {
    @FXML
    private Button solve;
    @FXML
    private Button clear;
    @FXML
    private Button close;
    @FXML
    private Button generat;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TableView table;
    @FXML
    void initialize(){

        close.setOnAction(event -> {
            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();});
        clear.setOnAction(event -> {
            a.setText("");b.setText("");table.getItems().clear();
        });
        generat.setOnAction(event -> {
            Random random = new Random(0);
            double[] k = new double[10];
             for (int i=0;i<k.length;i++){
                k[i] = ((double) (Math.random() * 30) - 15);
                //отправить в таблицу
                table.getItems().add(Double.toString(k[i]));
            }
        });
        solve.setOnAction(event -> {
            double aa = Double.parseDouble(a.getText());
            double bb = Double.parseDouble(b.getText());
            double[] y = new double[10];
            double[] k = new double[10];
            double sum=0;
            for (int i=1;i<=k.length;i++){
                // скачать из таблицы из нулевого столбца д-е в массив k[i] не знаю как???
               if (i==1) continue;  sum+=k[i];
            if ((k[i]!=0 && aa!=0  && bb!=0) || (aa!=0  && bb!=0))
                y[i] = Math.sqrt((Math.pow(Math.cos(k[i]),2))/(Math.pow(aa,2)+Math.pow(bb,2)))*sum;
// отправить массив в таблицу в 1й столбец, при этом если i=1 то отправить пустую строку, КАК?????
            }
        });
    }

}
