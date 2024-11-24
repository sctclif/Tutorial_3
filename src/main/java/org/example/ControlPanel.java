package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ControlPanel extends JPanel {

    int[] RGBvalues = {0, 0, 0};
    int Size = 10;
    String Shape = "Circle";

    GridLayout layout = new GridLayout(5,1);
    public ControlPanel() {
        setBackground(Color.GRAY);
        String[] SliderNames = {"R", "G", "B"};
        String[] DropChoices = {"Circle","Rectangle", "Square"};
        JSlider[] sliders = new JSlider[3];
        for (int i = 0; i < SliderNames.length; i++) {
            JPanel subpanel = new JPanel();
            sliders[i] = new JSlider(0, 255, 0);
            subpanel.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            int finalI = i;
            sliders[i].addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    RGBvalues[finalI] = sliders[finalI].getValue();
                }
            });


            JLabel label = new JLabel(SliderNames[i]);
            subpanel.add(label);
            c.gridx = 1;
            c.gridy = 1;
            c.gridwidth = 2;
            c.fill = GridBagConstraints.HORIZONTAL;
            subpanel.add(sliders[i], c);
            add(subpanel);

        }

        JPanel subpanel = new JPanel();
        JSlider size = new JSlider(0, 100, 10);
        subpanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JLabel label = new JLabel("Size");
        subpanel.add(label);
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        subpanel.add(size, c);
        add(subpanel);

        size.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Size = size.getValue();
            }
        });
        JComboBox ShapePicker = new JComboBox(DropChoices);
        ShapePicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Shape = (String) ShapePicker.getSelectedItem();
            }
        });
        add(size);
        add(ShapePicker);
    }

    public int[] getValues(){
        int[] values = new int[4];
        for (int i = 0; i < RGBvalues.length; i++) {
            values[i] = RGBvalues[i];
        }

        values[3] = Size;
        System.out.println(Arrays.toString(values));
        return values;
    }
    public String getShape(){

        return Shape;
    }


}
