import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Класс должен называться Lab10, так как файл называется Lab10.java
public class Lab10 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String name = "";
    Color shapeColor = Color.BLUE; // Начальный цвет фигуры

    @Override
    public void init() {
        // Создание элементов (Задание 10) [cite: 123-125]
        tf = new TextField(15);
        btn = new Button("Ок");

        add(new Label("Введите имя:"));
        add(tf);
        add(btn);

        // Регистрация слушателя для кнопки [cite: 48]
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получение текста из поля (Задание 6, 10) [cite: 76, 127]
        name = tf.getText();

        // Изменение цвета фигуры при нажатии (Задание 10)
        // Сделаем смену на красный для наглядности
        shapeColor = Color.RED;

        repaint(); // Перерисовываем апплет [cite: 52]
    }

    @Override
    public void paint(Graphics g) {
        // Рисование прямоугольника (Задание 1, 10) [cite: 26, 102]
        g.setColor(shapeColor);
        g.drawRect(50, 100, 150, 50);

        // Вывод приветствия (Задание 6, 10) [cite: 80, 114]
        g.setColor(Color.BLACK);
        g.drawString("Привет, " + name, 60, 130);
    }
}