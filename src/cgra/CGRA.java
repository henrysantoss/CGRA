package cgra;

import javax.swing.*;
import java.awt.*;

import cgra.Frame.main;

public class CGRA {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }

                UIManager.put("control", new Color(50, 50, 50));
                UIManager.put("info", new Color(60, 60, 60));
                UIManager.put("nimbusBase", new Color(45, 45, 45));
                UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
                UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusGreen", new Color(176, 179, 50));
                UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
                UIManager.put("nimbusLightBackground", new Color(30, 30, 30));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusRed", new Color(169, 46, 34));
                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
                UIManager.put("nimbusSelectionBackground", new Color(70, 70, 70));
                UIManager.put("text", new Color(230, 230, 230));

            } catch (Exception e) {
                e.printStackTrace();
            }

            main tela = new main();
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        });
    }

}
