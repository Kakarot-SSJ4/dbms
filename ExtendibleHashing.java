import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ExtendibleHashing {  
    public static void main(String[] args) {  
    JFrame frame = new JFrame();
              
    JTextField inputNumbers = new JTextField("Enter Numbers Here");
    JButton startHashingButton = new JButton("Start Hashing");
    
    inputNumbers.setBounds(130,100,200, 40);
    startHashingButton.setBounds(130, 130, 150, 40);

     startHashingButton.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            startHashing(inputNumbers.getText());
        }
    });
              
    frame.add(inputNumbers);
    frame.add(startHashingButton);
              
    frame.setSize(400,500);
    frame.setLayout(null);
    frame.setVisible(true);
    }

    static void startHashing(String numbers) {
        StringTokenizer tokenizerOfNumbers = new StringTokenizer(numbers, " ");
        Vector<String> binaryNumberVector = new Vector<String>();
        while(tokenizerOfNumbers.hasMoreTokens()) {
            int number = hashFunction(Integer.parseInt(tokenizerOfNumbers.nextToken()));
            String binaryNumber = Integer.toBinaryString(number);
            binaryNumberVector.add(binaryNumber);
        }

        allocateToBuckets(binaryNumberVector);
    }

    static int hashFunction(int number) {
        return number % 10;
    }

    // You have to fill this function
    // Input - binary representation of all input numbers' hashed values in string in a vector
    // Output - allocate all the binary strings into buckets
    // Assume a GD, LD and bfr of your choice
    // hash function is x % 10
    static void allocateToBuckets(Vector<String> binaryNumberVector) {

    }
}