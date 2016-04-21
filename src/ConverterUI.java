import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class ConverterUI extends JFrame{
	private JButton convertButton, clearButton;
	private JComboBox<Unit> unit1, unit2;
	private JLabel equal;
	private JTextField input1, input2;
	private UnitConverter unitconverter;
	
	public ConverterUI( UnitConverter uc ) {
		this.unitconverter = uc;
		
		this.setTitle("Length Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		
		convertButton = new JButton("Convert!!");
		clearButton = new JButton("Clear");
		equal = new JLabel("=");
		input1 = new JTextField(7);
		input2 = new JTextField(7);
		input2.setEditable(false);
		
		Unit[] lengths = unitconverter.getUnits();
		unit1 = new JComboBox<Unit>( lengths );
		unit2 = new JComboBox<Unit>( lengths );
		
		
		JPanel contents = new JPanel();
		contents.setLayout(new FlowLayout());
		
		
		contents.add(input1);
		contents.add(unit1);
		contents.add(equal);
		contents.add(input2);
		contents.add(unit2);
		
		contents.add ( convertButton );
		ActionListener listener = new ConvertButtonListener();
		convertButton.addActionListener( listener );
		
		contents.add ( clearButton );
		
		this.add(contents);
	}
	public void run() {
		this.pack();
		this.setVisible(true);
	}
	
	class ConvertButtonListener implements ActionListener {
		public void actionPerformed( ActionEvent evt ) {
			String s = input1.getText().trim();
			System.out.println("actionPerformed: input=" + s);
			if ( s.length() > 0 ) {
				try {
					double value = Double.valueOf( s );
					Unit fromUnit = (Unit) unit1.getSelectedItem();
					Unit toUnit = (Unit) unit2.getSelectedItem();
					double result = unitconverter.convert(value, fromUnit, toUnit);
					input2.setText( String.format("%.2f", result) );
				} catch ( Exception e ) {
					
				}
			} 
			
		}
	}
}
