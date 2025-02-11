package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JButton next;
    JRadioButton sYes, sNo, eYes, eNo;
    JComboBox religion, category, income, education, occupation;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String valEducation[] = {"Non-Graduation", "Graduate", "Post Graduation", "Doctrate", "Other"};
        education = new JComboBox(valEducation);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        String valOccupation[] = {"Salaried", "Self Employed", "Business", "Student", "Retired", "Other"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel jaadhar = new JLabel("Aadhaar Number:");
        jaadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        jaadhar.setBounds(100, 490, 200, 30);
        add(jaadhar);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        sYes = new JRadioButton("Yes");//Senior Citizen Yes
        sYes.setBounds(300, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(450, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup seniorCitizengroup = new ButtonGroup();
        seniorCitizengroup.add(sYes);
        seniorCitizengroup.add(sNo);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eYes = new JRadioButton("Yes");//Existing Account Yes
        eYes.setBounds(300, 590, 100, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);

        eNo = new JRadioButton("No");
        eNo.setBounds(450, 590, 100, 30);
        eNo.setBackground(Color.WHITE);
        add(eNo);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eYes);
        existingAccountGroup.add(eNo);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();

        String seniorcitizen = null;
        if (sYes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sNo.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eYes.isSelected()) {
            existingaccount = "Yes";
        } else if (eNo.isSelected()) {
            existingaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "','" + scategory + "','" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "','" + saadhar + "', '" + seniorcitizen + "', '" + existingaccount + "')";
            c.s.executeUpdate(query);

            //Signup3 Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
