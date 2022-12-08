
package RestaurantView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import java.io.*; 
import java.util.*; 
import java.awt.*;

import RestaurantController.*;
import RestaurantModel.*;
import java.awt.Color;
import javax.swing.JButton;
/**
 *
 * @author yaseminorhun.yaso
 */
public  class main_page extends javax.swing.JFrame implements Runnable{
    public int hour,second,minute;
    public DBConnection conn;
    Table table1 = new Table(1);
    Table table2 = new Table(2);
    Table table3 = new Table(3);
    Table table4 = new Table(4);
    Table table5 = new Table(5);
    Table table6 = new Table(6);
    Table table7 = new Table(7);
    Table table8 = new Table(8);
    Table table9 = new Table(9);
    Table table10 = new Table(10);
    Table table11 = new Table(11);
    Table table12 = new Table(12);
    /**
     * Creates new form main_page
     */
    public main_page() {
        initComponents();
        date();
        time();
        name();
        conn = new DBConnection();
	conn.establishConnection();
        changeColor(table_one, table1);
        changeColor(table_two, table2);
        changeColor(table_three, table3);
        changeColor(table_four, table4);
        changeColor(table_five, table5);
        changeColor(table_six, table6);
        changeColor(table_seven, table7);
        changeColor(table_eight, table8);
        changeColor(table_nine, table9);
        changeColor(table_ten, table10);
        changeColor(table_eleven, table11);
        changeColor(table_twelve, table12);
     
    }
    ///Date
    public void date(){
        date.setText("Date : " + new SimpleDateFormat("dd/MM/yyyy",new Locale("tr")).format(new Date()));
    }
    //time
    public void time(){
        new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
                time.setText("Time : " +sdf.format(new Date()));
            }
        }).start();
    }
    
    
   
    //Restaurant Name
    public void name(){
        restaurant_name.setText("zucca pizza & cafe");
    }
    
    
    public static void changeColor(JButton button, Table table){       
        if(table.isAvailable()){
            button.setBackground(Color.gray);
        }
        else{
            button.setBackground(new Color(148,223,148));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        main_page_panel = new javax.swing.JPanel();
        table_three = new javax.swing.JButton();
        table_one = new javax.swing.JButton();
        table_five = new javax.swing.JButton();
        table_six = new javax.swing.JButton();
        table_four = new javax.swing.JButton();
        table_eight = new javax.swing.JButton();
        table_nine = new javax.swing.JButton();
        table_seven = new javax.swing.JButton();
        table_eleven = new javax.swing.JButton();
        table_twelve = new javax.swing.JButton();
        table_ten = new javax.swing.JButton();
        revenue_button = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        restaurant_name = new javax.swing.JLabel();
        available_label = new javax.swing.JLabel();
        unavailable_label = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        table_two = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        main_page_panel.setBackground(new java.awt.Color(255, 255, 255));

        table_three.setBackground(new java.awt.Color(148, 223, 148));
        table_three.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_three.setText("3");
        table_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_threeActionPerformed(evt);
            }
        });

        table_one.setBackground(new java.awt.Color(148, 223, 148));
        table_one.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_one.setText("1");
        table_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_oneActionPerformed(evt);
            }
        });

        table_five.setBackground(new java.awt.Color(148, 223, 148));
        table_five.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_five.setText("5");
        table_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_fiveActionPerformed(evt);
            }
        });

        table_six.setBackground(new java.awt.Color(148, 223, 148));
        table_six.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_six.setText("6");
        table_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_sixActionPerformed(evt);
            }
        });

        table_four.setBackground(new java.awt.Color(148, 223, 148));
        table_four.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_four.setText("4");
        table_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_fourActionPerformed(evt);
            }
        });

        table_eight.setBackground(new java.awt.Color(148, 223, 148));
        table_eight.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_eight.setText("8");
        table_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_eightActionPerformed(evt);
            }
        });

        table_nine.setBackground(new java.awt.Color(148, 223, 148));
        table_nine.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_nine.setText("9");
        table_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_nineActionPerformed(evt);
            }
        });

        table_seven.setBackground(new java.awt.Color(148, 223, 148));
        table_seven.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_seven.setText("7");
        table_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_sevenActionPerformed(evt);
            }
        });

        table_eleven.setBackground(new java.awt.Color(148, 223, 148));
        table_eleven.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_eleven.setText("11");
        table_eleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_elevenActionPerformed(evt);
            }
        });

        table_twelve.setBackground(new java.awt.Color(148, 223, 148));
        table_twelve.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_twelve.setText("12");
        table_twelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_twelveActionPerformed(evt);
            }
        });

        table_ten.setBackground(new java.awt.Color(148, 223, 148));
        table_ten.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_ten.setText("10");
        table_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_tenActionPerformed(evt);
            }
        });

        revenue_button.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        revenue_button.setText("Revenue");
        revenue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenue_buttonActionPerformed(evt);
            }
        });

        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("time");

        restaurant_name.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        restaurant_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        restaurant_name.setText("Restaurant name");
        restaurant_name.setToolTipText("");
        restaurant_name.setIgnoreRepaint(true);

        available_label.setBackground(new java.awt.Color(148, 223, 148));
        available_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        available_label.setText("available");
        available_label.setOpaque(true);

        unavailable_label.setBackground(new java.awt.Color(153, 153, 153));
        unavailable_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unavailable_label.setText("unavailable");
        unavailable_label.setOpaque(true);

        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("date");

        table_two.setBackground(new java.awt.Color(148, 223, 148));
        table_two.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        table_two.setText("2");
        table_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_twoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_page_panelLayout = new javax.swing.GroupLayout(main_page_panel);
        main_page_panel.setLayout(main_page_panelLayout);
        main_page_panelLayout.setHorizontalGroup(
            main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_page_panelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_page_panelLayout.createSequentialGroup()
                        .addComponent(restaurant_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(main_page_panelLayout.createSequentialGroup()
                        .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, main_page_panelLayout.createSequentialGroup()
                                .addComponent(table_two, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(table_five, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(table_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(table_eleven, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, main_page_panelLayout.createSequentialGroup()
                                .addComponent(table_one, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(table_four, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(table_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(table_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, main_page_panelLayout.createSequentialGroup()
                                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(main_page_panelLayout.createSequentialGroup()
                                        .addComponent(available_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unavailable_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(table_three, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(main_page_panelLayout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(table_six, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(table_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(table_twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(main_page_panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(revenue_button)))))
                        .addGap(72, 76, Short.MAX_VALUE))))
        );

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {table_eight, table_eleven, table_five, table_four, table_nine, table_one, table_seven, table_six, table_ten, table_three, table_twelve, table_two});

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {available_label, unavailable_label});

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {date, time});

        main_page_panelLayout.setVerticalGroup(
            main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_page_panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(main_page_panelLayout.createSequentialGroup()
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time))
                    .addComponent(restaurant_name))
                .addGap(72, 72, 72)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(main_page_panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(table_four, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(table_one, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(table_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(table_five, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(table_two, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(table_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(table_eleven, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_three, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_six, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(main_page_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unavailable_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(available_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenue_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {table_eight, table_eleven, table_five, table_four, table_nine, table_one, table_seven, table_six, table_ten, table_three, table_twelve, table_two});

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {available_label, unavailable_label});

        main_page_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date, time});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_page_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_page_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void table_twoActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        enter_ID frame =new enter_ID(table2,table_two);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
              
    }                                         

    private void table_threeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        enter_ID frame =new enter_ID(table3,table_three);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                           

    private void table_oneActionPerformed(java.awt.event.ActionEvent evt) {                                          
        enter_ID frame =new enter_ID(table1,table_one);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                         

    private void table_fiveActionPerformed(java.awt.event.ActionEvent evt) {                                           
        enter_ID frame =new enter_ID(table5,table_five);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                          

    private void table_sixActionPerformed(java.awt.event.ActionEvent evt) {                                          
        enter_ID frame =new enter_ID(table6,table_six);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                         

    private void table_fourActionPerformed(java.awt.event.ActionEvent evt) {                                           
        enter_ID frame =new enter_ID(table4,table_four);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                          

    private void table_eightActionPerformed(java.awt.event.ActionEvent evt) {                                            
        enter_ID frame =new enter_ID(table8,table_eight);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                           

    private void table_nineActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
        enter_ID frame =new enter_ID(table9,table_nine);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                          

    private void table_sevenActionPerformed(java.awt.event.ActionEvent evt) {                                            

        enter_ID frame =new enter_ID(table7,table_seven);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                           

    private void table_elevenActionPerformed(java.awt.event.ActionEvent evt) {                                             
      
        enter_ID frame =new enter_ID(table11,table_eleven);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                            

    private void table_twelveActionPerformed(java.awt.event.ActionEvent evt) {                                             
     
        enter_ID frame =new enter_ID(table12,table_twelve);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                            

    private void table_tenActionPerformed(java.awt.event.ActionEvent evt) {                                          

        enter_ID frame =new enter_ID(table10,table_ten);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                         

    private void revenue_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                               

        calculate_revenue frame =new calculate_revenue();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                              

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   

        conn.closeConnection();
    }                                  

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main_page frame =new main_page();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel available_label;
    private javax.swing.JLabel date;
    private javax.swing.JPanel main_page_panel;
    private javax.swing.JLabel restaurant_name;
    private javax.swing.JButton revenue_button;
    private static javax.swing.JButton table_eight;
    private static javax.swing.JButton table_eleven;
    private static javax.swing.JButton table_five;
    private static javax.swing.JButton table_four;
    private static javax.swing.JButton table_nine;
    private static javax.swing.JButton table_one;
    private static javax.swing.JButton table_seven;
    private static javax.swing.JButton table_six;
    private static javax.swing.JButton table_ten;
    private static javax.swing.JButton table_three;
    private static javax.swing.JButton table_twelve;
    private static javax.swing.JButton table_two;
    private javax.swing.JLabel time;
    private javax.swing.JLabel unavailable_label;
    // End of variables declaration                   

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
}
