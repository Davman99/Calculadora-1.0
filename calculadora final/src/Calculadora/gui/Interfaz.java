/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora.gui;
import Calculadora.Calculadora;
import Calculadora.SistemaBinario;
import Calculadora.SistemaDecimal;
import Calculadora.SistemaHexa;
import Calculadora.SistemaNumerico;
import Calculadora.SistemaOctal;


/**
 * proporcionamos funcionalidad a los objetos de la interfaz y llamamos y utilizamos 
 * las diferentes clases para las diferentes operaciones y conversion de los numeros
 * a los diferentes sistemas
 * @author Jesus Roso           20172020051
 * @author David Manosalba      20172020058
 * @author Francisco Barrero    20172020062
 * @version 1.0
 */
public class Interfaz extends javax.swing.JFrame {
  
    /**
     * variables a utilizar en la interfaz 
     */
    char operador;
    String valor1;
    String valor2;
    boolean binario;
    char sistema; 
    SistemaNumerico s;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        
         
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        bin = new javax.swing.JButton();
        hexa = new javax.swing.JButton();
        octal = new javax.swing.JButton();
        Borrar1 = new javax.swing.JButton();
        Borrartodo = new javax.swing.JButton();
        Decimal = new javax.swing.JButton();
        letraA = new javax.swing.JButton();
        LetraB = new javax.swing.JButton();
        LetraC = new javax.swing.JButton();
        LetraD = new javax.swing.JButton();
        LetraE = new javax.swing.JButton();
        LetraF = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        multiplicacion.setText("*");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        bin.setText("BIN");
        bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binActionPerformed(evt);
            }
        });

        hexa.setText("HEX");
        hexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexaActionPerformed(evt);
            }
        });

        octal.setText("OCTA");
        octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalActionPerformed(evt);
            }
        });

        Borrar1.setText("C");
        Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar1ActionPerformed(evt);
            }
        });

        Borrartodo.setText("CE");
        Borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrartodoActionPerformed(evt);
            }
        });

        Decimal.setText("DEC");
        Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecimalActionPerformed(evt);
            }
        });

        letraA.setText("A");
        letraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraAActionPerformed(evt);
            }
        });

        LetraB.setText("B");
        LetraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraBActionPerformed(evt);
            }
        });

        LetraC.setText("C");
        LetraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraCActionPerformed(evt);
            }
        });

        LetraD.setText("D");
        LetraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraDActionPerformed(evt);
            }
        });

        LetraE.setText("E");
        LetraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraEActionPerformed(evt);
            }
        });

        LetraF.setText("F");
        LetraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pantalla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(Num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Num3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Borrartodo, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(suma, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bin, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(hexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(octal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hexa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Borrartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(octal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(Decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * funcion que da valor al boton 1
     */
    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '1');
    }//GEN-LAST:event_num1ActionPerformed

/**
     * funcion que da valor al boton 2
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '2');
    }//GEN-LAST:event_jButton2ActionPerformed

/**
     * funcion que da valor al boton 3
     */
    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '3');
    }//GEN-LAST:event_Num3ActionPerformed

/**
     * funcion que da valor al boton 4
     */
    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '4');
    }//GEN-LAST:event_Num4ActionPerformed

/**
     * funcion que da valor al boton 5
     */
    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '5');
    }//GEN-LAST:event_num5ActionPerformed

/**
     * funcion que da valor al boton 6
     */
    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '6');
    }//GEN-LAST:event_num6ActionPerformed

/**
     * funcion que da valor al boton 7
     */
    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '7');
    }//GEN-LAST:event_num7ActionPerformed

/**
     * funcion que da valor al boton 8
     */
    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '8');
    }//GEN-LAST:event_num8ActionPerformed

/**
     * funcion que da valor al boton 9
     */
    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '9');
    }//GEN-LAST:event_num9ActionPerformed

/**
     * funcion que da valor al boton 0
     */
    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + '0');
    }//GEN-LAST:event_num0ActionPerformed

/**
     * funcion que da valor al boton + y asigna el valor dde la pantalla a la variable
     * valor 1 y borra la pantalla
     */
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
          if(pantalla.getText().length() > 0) {
             valor1 = pantalla.getText();
            operador = '+';
            pantalla.setText("");
        }
    }//GEN-LAST:event_sumaActionPerformed
/**
     * funcion que da valor al boton - y asigna el valor dde la pantalla a la variable
     * valor 1 y borra la pantalla
     */
    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        // TODO add your handling code here:
        if(pantalla.getText().length() > 0) {
              valor1 = pantalla.getText();
            operador = '-';
            pantalla.setText("");
        }
    }//GEN-LAST:event_RestaActionPerformed
/**
     * funcion que da valor al boton * y asigna el valor dde la pantalla a la variable
     * valor 1 y borra la pantalla
     */
    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
        if(pantalla.getText().length() > 0) {
            valor1 = pantalla.getText();
            operador = '*';
            pantalla.setText("");
        }
    }//GEN-LAST:event_multiplicacionActionPerformed
/**
     * funcion que da valor al boton /, asigna el valor de la pantalla a la variable
     * valor 1 y borra la pantalla
     */
    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        if(pantalla.getText().length() > 0) {
             valor1 = pantalla.getText();
            operador = '/';
            pantalla.setText("");
        }
    }//GEN-LAST:event_divisionActionPerformed
/**
     * recoge el 2 valor de la pantalla y la asigna a la variable valor 2, 
     * selecciona el sistema numerico y realiza la operacion seleccionada
     */
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        
        if(pantalla.getText().length() > 0) {
            valor2 = (pantalla.getText());
            Calculadora c = new Calculadora();
            switch (sistema){
            case 'b':
                s = new SistemaBinario();
                break;
            case 'o':
                s = new SistemaOctal(); 
                break;   
            case 'h':
                s = new SistemaHexa();
                break;
            case 'd':
                s = new SistemaDecimal();
                break;
            default :
                s = new SistemaDecimal();
        }
            c.setValor1(s.convertirADecimal(valor1));
            c.setValor2(s.convertirADecimal(valor2));
             switch(operador){
                case '+':
                    c.suma();
                    pantalla.setText(s.convertirASistema(c.getResultado()));
                    break;
                 case '-':
                    c.resta();
                    pantalla.setText(s.convertirASistema(c.getResultado()));
                    break;
                case '*':
                    c.multiplicacion();
                    pantalla.setText(s.convertirASistema(c.getResultado()));
                    break;
                case '/':
                    c.division();
                    pantalla.setText(s.convertirASistema(c.getResultado()));
                    break;   
                
            }
            
        }
    }//GEN-LAST:event_igualActionPerformed
/**
     * asigna al boton de binarios el valor de b
     */
    private void binActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binActionPerformed
     sistema ='b';
    }//GEN-LAST:event_binActionPerformed
/**
     * borrar un caracter escrito en la pantalla
     */
    private void Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar1ActionPerformed
        // TODO add your handling code here:
        if(pantalla.getText().length() > 0) {
            pantalla.setText(pantalla.getText().substring(0, pantalla.getText().length()-1));
        }
    }//GEN-LAST:event_Borrar1ActionPerformed
/**
     * borra todo lo escrito en la pantalla
     */
    private void BorrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrartodoActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
    }//GEN-LAST:event_BorrartodoActionPerformed
    /**
     * asigna al boton de hexa el valor de h
     */
    private void hexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexaActionPerformed
        // TODO add your handling code here:
        sistema = 'h';
    }//GEN-LAST:event_hexaActionPerformed
    /**
     * asigna al boton de octal el valor de o
     */
    private void octalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalActionPerformed
        // TODO add your handling code here:
        sistema = 'o';
    }//GEN-LAST:event_octalActionPerformed

    /**
     * asigna al boton de decimal el valor de d
     */
    private void DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecimalActionPerformed
        // TODO add your handling code here:
        sistema = 'd';
    }//GEN-LAST:event_DecimalActionPerformed
/**
     * funcion que da valor al boton A
     */
    private void letraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraAActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'A');
    }//GEN-LAST:event_letraAActionPerformed
/**
     * funcion que da valor al boton B
     */
    private void LetraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraBActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'B');
    }//GEN-LAST:event_LetraBActionPerformed
/**
     * funcion que da valor al boton C
     */
    private void LetraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraCActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'C');
    }//GEN-LAST:event_LetraCActionPerformed
/**
     * funcion que da valor al boton D
     */
    private void LetraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraDActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'D');
    }//GEN-LAST:event_LetraDActionPerformed
/**
     * funcion que da valor al boton E
     */
    private void LetraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraEActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'E');
    }//GEN-LAST:event_LetraEActionPerformed
/**
     * funcion que da valor al boton F
     */
    private void LetraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraFActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText() + 'F');
    }//GEN-LAST:event_LetraFActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar1;
    private javax.swing.JButton Borrartodo;
    private javax.swing.JButton Decimal;
    private javax.swing.JButton LetraB;
    private javax.swing.JButton LetraC;
    private javax.swing.JButton LetraD;
    private javax.swing.JButton LetraE;
    private javax.swing.JButton LetraF;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Resta;
    private javax.swing.JButton bin;
    private javax.swing.JButton division;
    private javax.swing.JButton hexa;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton letraA;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton octal;
    private javax.swing.JTextField pantalla;
    public javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables

   
}
