package com.developIt;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainController implements Initializable {
    protected final static Timer timer = new Timer();
    private final String dolphinImage = "DevelopIt_maze/src/main/resources/com/developIt/dolphin.jpeg";
    private final String ballImage = "DevelopIt_maze/src/main/resources/com/developIt/ball.png";
    private final HashMap<Integer, String> algorithms;
    @FXML
    private Rectangle rectangle_0;
    @FXML
    private Rectangle rectangle_1;
    @FXML
    private Rectangle rectangle_10;
    @FXML
    private Rectangle rectangle_100;
    @FXML
    private Rectangle rectangle_101;
    @FXML
    private Rectangle rectangle_102;
    @FXML
    private Rectangle rectangle_103;
    @FXML
    private Rectangle rectangle_104;
    @FXML
    private Rectangle rectangle_105;
    @FXML
    private Rectangle rectangle_106;
    @FXML
    private Rectangle rectangle_107;
    @FXML
    private Rectangle rectangle_108;
    @FXML
    private Rectangle rectangle_109;
    @FXML
    private Rectangle rectangle_11;
    @FXML
    private Rectangle rectangle_110;
    @FXML
    private Rectangle rectangle_111;
    @FXML
    private Rectangle rectangle_112;
    @FXML
    private Rectangle rectangle_113;
    @FXML
    private Rectangle rectangle_114;
    @FXML
    private Rectangle rectangle_115;
    @FXML
    private Rectangle rectangle_116;
    @FXML
    private Rectangle rectangle_117;
    @FXML
    private Rectangle rectangle_118;
    @FXML
    private Rectangle rectangle_119;
    @FXML
    private Rectangle rectangle_12;
    @FXML
    private Rectangle rectangle_120;
    @FXML
    private Rectangle rectangle_121;
    @FXML
    private Rectangle rectangle_122;
    @FXML
    private Rectangle rectangle_123;
    @FXML
    private Rectangle rectangle_124;
    @FXML
    private Rectangle rectangle_125;
    @FXML
    private Rectangle rectangle_126;
    @FXML
    private Rectangle rectangle_127;
    @FXML
    private Rectangle rectangle_128;
    @FXML
    private Rectangle rectangle_129;
    @FXML
    private Rectangle rectangle_13;
    @FXML
    private Rectangle rectangle_130;
    @FXML
    private Rectangle rectangle_131;
    @FXML
    private Rectangle rectangle_132;
    @FXML
    private Rectangle rectangle_133;
    @FXML
    private Rectangle rectangle_134;
    @FXML
    private Rectangle rectangle_135;
    @FXML
    private Rectangle rectangle_136;
    @FXML
    private Rectangle rectangle_137;
    @FXML
    private Rectangle rectangle_138;
    @FXML
    private Rectangle rectangle_139;
    @FXML
    private Rectangle rectangle_14;
    @FXML
    private Rectangle rectangle_140;
    @FXML
    private Rectangle rectangle_141;
    @FXML
    private Rectangle rectangle_142;
    @FXML
    private Rectangle rectangle_143;
    @FXML
    private Rectangle rectangle_144;
    @FXML
    private Rectangle rectangle_145;
    @FXML
    private Rectangle rectangle_146;
    @FXML
    private Rectangle rectangle_147;
    @FXML
    private Rectangle rectangle_148;
    @FXML
    private Rectangle rectangle_149;
    @FXML
    private Rectangle rectangle_15;
    @FXML
    private Rectangle rectangle_150;
    @FXML
    private Rectangle rectangle_152;
    @FXML
    private Rectangle rectangle_153;
    @FXML
    private Rectangle rectangle_154;
    @FXML
    private Rectangle rectangle_155;
    @FXML
    private Rectangle rectangle_156;
    @FXML
    private Rectangle rectangle_157;
    @FXML
    private Rectangle rectangle_158;
    @FXML
    private Rectangle rectangle_159;
    @FXML
    private Rectangle rectangle_16;
    @FXML
    private Rectangle rectangle_160;
    @FXML
    private Rectangle rectangle_161;
    @FXML
    private Rectangle rectangle_162;
    @FXML
    private Rectangle rectangle_163;
    @FXML
    private Rectangle rectangle_164;
    @FXML
    private Rectangle rectangle_165;
    @FXML
    private Rectangle rectangle_166;
    @FXML
    private Rectangle rectangle_167;
    @FXML
    private Rectangle rectangle_168;
    @FXML
    private Rectangle rectangle_169;
    @FXML
    private Rectangle rectangle_17;
    @FXML
    private Rectangle rectangle_170;
    @FXML
    private Rectangle rectangle_171;
    @FXML
    private Rectangle rectangle_172;
    @FXML
    private Rectangle rectangle_173;
    @FXML
    private Rectangle rectangle_174;
    @FXML
    private Rectangle rectangle_175;
    @FXML
    private Rectangle rectangle_176;
    @FXML
    private Rectangle rectangle_177;
    @FXML
    private Rectangle rectangle_178;
    @FXML
    private Rectangle rectangle_179;
    @FXML
    private Rectangle rectangle_18;
    @FXML
    private Rectangle rectangle_180;
    @FXML
    private Rectangle rectangle_181;
    @FXML
    private Rectangle rectangle_182;
    @FXML
    private Rectangle rectangle_183;
    @FXML
    private Rectangle rectangle_184;
    @FXML
    private Rectangle rectangle_185;
    @FXML
    private Rectangle rectangle_186;
    @FXML
    private Rectangle rectangle_187;
    @FXML
    private Rectangle rectangle_188;
    @FXML
    private Rectangle rectangle_189;
    @FXML
    private Rectangle rectangle_19;
    @FXML
    private Rectangle rectangle_190;
    @FXML
    private Rectangle rectangle_191;
    @FXML
    private Rectangle rectangle_192;
    @FXML
    private Rectangle rectangle_193;
    @FXML
    private Rectangle rectangle_194;
    @FXML
    private Rectangle rectangle_2;
    @FXML
    private Rectangle rectangle_20;
    @FXML
    private Rectangle rectangle_21;
    @FXML
    private Rectangle rectangle_22;
    @FXML
    private Rectangle rectangle_23;
    @FXML
    private Rectangle rectangle_24;
    @FXML
    private Rectangle rectangle_25;
    @FXML
    private Rectangle rectangle_26;
    @FXML
    private Rectangle rectangle_27;
    @FXML
    private Rectangle rectangle_28;
    @FXML
    private Rectangle rectangle_29;
    @FXML
    private Rectangle rectangle_3;
    @FXML
    private Rectangle rectangle_30;
    @FXML
    private Rectangle rectangle_31;
    @FXML
    private Rectangle rectangle_32;
    @FXML
    private Rectangle rectangle_33;
    @FXML
    private Rectangle rectangle_34;
    @FXML
    private Rectangle rectangle_35;
    @FXML
    private Rectangle rectangle_36;
    @FXML
    private Rectangle rectangle_37;
    @FXML
    private Rectangle rectangle_38;
    @FXML
    private Rectangle rectangle_39;
    @FXML
    private Rectangle rectangle_4;
    @FXML
    private Rectangle rectangle_40;
    @FXML
    private Rectangle rectangle_41;
    @FXML
    private Rectangle rectangle_42;
    @FXML
    private Rectangle rectangle_43;
    @FXML
    private Rectangle rectangle_44;
    @FXML
    private Rectangle rectangle_45;
    @FXML
    private Rectangle rectangle_46;
    @FXML
    private Rectangle rectangle_47;
    @FXML
    private Rectangle rectangle_48;
    @FXML
    private Rectangle rectangle_49;
    @FXML
    private Rectangle rectangle_5;
    @FXML
    private Rectangle rectangle_50;
    @FXML
    private Rectangle rectangle_51;
    @FXML
    private Rectangle rectangle_52;
    @FXML
    private Rectangle rectangle_53;
    @FXML
    private Rectangle rectangle_54;
    @FXML
    private Rectangle rectangle_55;
    @FXML
    private Rectangle rectangle_56;
    @FXML
    private Rectangle rectangle_57;
    @FXML
    private Rectangle rectangle_58;
    @FXML
    private Rectangle rectangle_59;
    @FXML
    private Rectangle rectangle_6;
    @FXML
    private Rectangle rectangle_60;
    @FXML
    private Rectangle rectangle_61;
    @FXML
    private Rectangle rectangle_62;
    @FXML
    private Rectangle rectangle_63;
    @FXML
    private Rectangle rectangle_64;
    @FXML
    private Rectangle rectangle_65;
    @FXML
    private Rectangle rectangle_66;
    @FXML
    private Rectangle rectangle_67;
    @FXML
    private Rectangle rectangle_68;
    @FXML
    private Rectangle rectangle_69;
    @FXML
    private Rectangle rectangle_7;
    @FXML
    private Rectangle rectangle_70;
    @FXML
    private Rectangle rectangle_71;
    @FXML
    private Rectangle rectangle_72;
    @FXML
    private Rectangle rectangle_73;
    @FXML
    private Rectangle rectangle_74;
    @FXML
    private Rectangle rectangle_75;
    @FXML
    private Rectangle rectangle_76;
    @FXML
    private Rectangle rectangle_77;
    @FXML
    private Rectangle rectangle_78;
    @FXML
    private Rectangle rectangle_79;
    @FXML
    private Rectangle rectangle_8;
    @FXML
    private Rectangle rectangle_80;
    @FXML
    private Rectangle rectangle_81;
    @FXML
    private Rectangle rectangle_82;
    @FXML
    private Rectangle rectangle_83;
    @FXML
    private Rectangle rectangle_84;
    @FXML
    private Rectangle rectangle_85;
    @FXML
    private Rectangle rectangle_86;
    @FXML
    private Rectangle rectangle_87;
    @FXML
    private Rectangle rectangle_88;
    @FXML
    private Rectangle rectangle_89;
    @FXML
    private Rectangle rectangle_9;
    @FXML
    private Rectangle rectangle_90;
    @FXML
    private Rectangle rectangle_91;
    @FXML
    private Rectangle rectangle_92;
    @FXML
    private Rectangle rectangle_93;
    @FXML
    private Rectangle rectangle_94;
    @FXML
    private Rectangle rectangle_95;
    @FXML
    private Rectangle rectangle_96;
    @FXML
    private Rectangle rectangle_97;
    @FXML
    private Rectangle rectangle_98;
    @FXML
    private Rectangle rectangle_99;
    @FXML
    private Rectangle rectangle_151;
    @FXML
    private Label timeLabel;
    @FXML
    private MenuButton algorithmMenu;
    @FXML
    private MenuButton controlsMenu;

    private Rectangle[][] rectangleMatrix;
    private int fishX;
    private int fishY;

    {
        algorithms = new HashMap<>();
        algorithms.put(0, "Path-Find");
    }

    private static Alert customizeDialogAndGet(String algorithmName) {
        byte[] emoji_bytes = new byte[]{(byte) 0xF0, (byte) 0x9F, (byte) 0x98, (byte) 0x89};
        Alert dialog = new Alert(Alert.AlertType.CONFIRMATION);
        dialog.setTitle("Confirm you want to use " + algorithmName + " algorithm!");
        String emoji = new String(emoji_bytes, StandardCharsets.UTF_8);
        dialog.setHeaderText("Let's feed pingu with " + algorithmName + "!" + emoji);
        return dialog;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Add Algorithm choices (AlgorithmX, AlgorithmY, ...) to MenuButton also add confirm dialogs when they are chosen.
        addAlgorithmOptions(algorithms);

        //Initializes 2D matrix with rectangles(boxes on GUI) from 0 to end.
        indexMatrixWithRectangles();

        addCharacterIcons();

        //Runs timer which shows app start to end time.
        new Time<>(timeLabel).set(timer);

        addControls();
    }

    private void addControls() {

        controlsMenu.getItems().remove(0, 2);
        MenuItem wall = new MenuItem();
        wall.setText("Walls");
        controlsMenu.getItems().add(wall);

        wall.setOnAction((wallIsChosen) -> {
            setClickedRectangleColorToBlack();
        });
    }

    private void setClickedRectangleColorToBlack() {
        for (int rj = 0; rj < rectangleMatrix.length; rj++) {
            for (int ri = 0; ri < rectangleMatrix[0].length; ri++) {
                int finalRj = rj;
                int finalRi = ri;
                rectangleMatrix[rj][ri].setOnMouseClicked((clicked) -> {
                    rectangleMatrix[finalRj][finalRi].setFill(Color.BLACK);
                });
            }
        }
    }

    private void addCharacterIcons() {
        rectangle_0.setFill(Image.build(dolphinImage));

        int randomX = new Random().nextInt(1, rectangleMatrix[0].length);
        int randomY = new Random().nextInt(1, rectangleMatrix.length);

        rectangleMatrix[randomY][randomX].setFill(Image.build(ballImage));
        fishX = randomX;
        fishY = randomY;
    }

    private void addAlgorithmOptions(HashMap<Integer, String> algorithms) {
        algorithmMenu.getItems().remove(0, 2);
        for (int ci = 0; ci < algorithms.size(); ci++) {
            MenuItem menuItem = new MenuItem();
            String algorithmName = algorithms.get(ci);
            menuItem.setOnAction((clicked) -> {
                attachConfirmationDialog(algorithmName);
            });
            menuItem.setText(algorithmName);
            algorithmMenu.getItems().add(menuItem);
        }
    }

    private void attachConfirmationDialog(String algorithmName) {
        Alert dialog = customizeDialogAndGet(algorithmName);

        Optional<ButtonType> dialogButton = dialog.showAndWait();
        if (dialogButton.get() == ButtonType.OK) {
            if (algorithmName.equalsIgnoreCase(algorithmName)) {
                Platform.runLater(() -> {
                    new Algorithms().choose(algorithmName, rectangleMatrix, new Point(fishX, fishY), dolphinImage);
                });
            }
        }
    }

    private void indexMatrixWithRectangles() {
        rectangleMatrix = new Rectangle[][]{{rectangle_0, rectangle_1, rectangle_2, rectangle_3, rectangle_4, rectangle_5, rectangle_6, rectangle_7, rectangle_8, rectangle_9, rectangle_10, rectangle_11, rectangle_12, rectangle_13, rectangle_14}, {rectangle_15, rectangle_16, rectangle_17, rectangle_18, rectangle_19, rectangle_20, rectangle_21, rectangle_22, rectangle_23, rectangle_24, rectangle_25, rectangle_26, rectangle_27, rectangle_28, rectangle_29}, {rectangle_30, rectangle_31, rectangle_32, rectangle_33, rectangle_34, rectangle_35, rectangle_36, rectangle_37, rectangle_38, rectangle_39, rectangle_40, rectangle_41, rectangle_42, rectangle_43, rectangle_44}, {rectangle_45, rectangle_46, rectangle_47, rectangle_48, rectangle_49, rectangle_50, rectangle_51, rectangle_52, rectangle_53, rectangle_54, rectangle_55, rectangle_56, rectangle_57, rectangle_58, rectangle_59}, {rectangle_60, rectangle_61, rectangle_62, rectangle_63, rectangle_64, rectangle_65, rectangle_66, rectangle_67, rectangle_68, rectangle_69, rectangle_70, rectangle_71, rectangle_72, rectangle_73, rectangle_74}, {rectangle_75, rectangle_76, rectangle_77, rectangle_78, rectangle_79, rectangle_80, rectangle_81, rectangle_82, rectangle_83, rectangle_84, rectangle_85, rectangle_86, rectangle_87, rectangle_88, rectangle_89}, {rectangle_90, rectangle_91, rectangle_92, rectangle_93, rectangle_94, rectangle_95, rectangle_96, rectangle_97, rectangle_98, rectangle_99, rectangle_100, rectangle_101, rectangle_102, rectangle_103, rectangle_104}, {rectangle_105, rectangle_106, rectangle_107, rectangle_108, rectangle_109, rectangle_110, rectangle_111, rectangle_112, rectangle_113, rectangle_114, rectangle_115, rectangle_116, rectangle_117, rectangle_118, rectangle_119}, {rectangle_120, rectangle_121, rectangle_122, rectangle_123, rectangle_124, rectangle_125, rectangle_126, rectangle_127, rectangle_128, rectangle_129, rectangle_130, rectangle_131, rectangle_132, rectangle_133, rectangle_134}, {rectangle_135, rectangle_136, rectangle_137, rectangle_138, rectangle_139, rectangle_140, rectangle_141, rectangle_142, rectangle_143, rectangle_144, rectangle_145, rectangle_146, rectangle_147, rectangle_148, rectangle_149}, {rectangle_150, rectangle_151, rectangle_152, rectangle_153, rectangle_154, rectangle_155, rectangle_156, rectangle_157, rectangle_158, rectangle_159, rectangle_160, rectangle_161, rectangle_162, rectangle_163, rectangle_164}, {rectangle_165, rectangle_166, rectangle_167, rectangle_168, rectangle_169, rectangle_170, rectangle_171, rectangle_172, rectangle_173, rectangle_174, rectangle_175, rectangle_176, rectangle_177, rectangle_178, rectangle_179}, {rectangle_180, rectangle_181, rectangle_182, rectangle_183, rectangle_184, rectangle_185, rectangle_186, rectangle_187, rectangle_188, rectangle_189, rectangle_190, rectangle_191, rectangle_192, rectangle_193, rectangle_194}};
    }

    private void fillMatrix() {
        var rand = new Random();
        int rx = 0, ry = 0;
        while (ry < rectangleMatrix.length) {
            while (rx < rectangleMatrix[ry].length) {
                rectangleMatrix[ry][rx].setFill(Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                rx++;
            }
            rx = 0;
            ry++;
        }
    }
}