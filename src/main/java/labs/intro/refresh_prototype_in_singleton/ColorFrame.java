package labs.intro.refresh_prototype_in_singleton;

import labs.intro.quoters.RandomUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveToRandomLocation() {
        setLocation(RandomUtil.getRandomValue(0, 1200),
                RandomUtil.getRandomValue(0, 900));
        getContentPane().setBackground(color);
        repaint();
    }
}
