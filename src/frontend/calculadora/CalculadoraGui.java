package frontend.calculadora;

import Manejadores.ManejadorDeCadenas;
import Manejadores.ManejadorTerminacionEnNumero;

import OperacionesJesfrin.Division;
import OperacionesJesfrin.Multiplicacion;
import OperacionesJesfrin.Raiz;
import OperacionesJesfrin.Residuo;
import OperacionesJesfrin.Resta;
import OperacionesJesfrin.Suma;

import OperacionesJames.Factorial;
import OperacionesJames.Permutacion;
import OperacionesJames.Combinacion;

import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class CalculadoraGui extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGui
     */
    public CalculadoraGui() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operacionesPanel = new javax.swing.JPanel();
        operacionesTextField = new javax.swing.JTextField();
        resultadoTextField = new javax.swing.JTextField();
        botonesPanel = new javax.swing.JPanel();
        factorialButton = new javax.swing.JButton();
        permutacionButton = new javax.swing.JButton();
        combinacionButton = new javax.swing.JButton();
        numero7Button = new javax.swing.JButton();
        numero8Button = new javax.swing.JButton();
        numero10Button = new javax.swing.JButton();
        numero4Button = new javax.swing.JButton();
        numero5Button = new javax.swing.JButton();
        numero6Button = new javax.swing.JButton();
        numero1Button = new javax.swing.JButton();
        numero2Button = new javax.swing.JButton();
        numero3Button = new javax.swing.JButton();
        puntoDecimalButton = new javax.swing.JButton();
        numero0Button = new javax.swing.JButton();
        ansButton = new javax.swing.JButton();
        botones2Panel = new javax.swing.JPanel();
        binarioButton = new javax.swing.JButton();
        octalButton = new javax.swing.JButton();
        hexadecimalButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        acButton = new javax.swing.JButton();
        restoButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        multiplicacionButton = new javax.swing.JButton();
        potenciaButton = new javax.swing.JButton();
        sumaButton = new javax.swing.JButton();
        restaButton = new javax.swing.JButton();
        raizButton = new javax.swing.JButton();
        igualButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        operacionesComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        operacionesPanel.setLayout(new java.awt.GridLayout(2, 1, 50, 25));

        operacionesTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                operacionesTextFieldKeyTyped(evt);
            }
        });
        operacionesPanel.add(operacionesTextField);

        resultadoTextField.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        operacionesPanel.add(resultadoTextField);

        botonesPanel.setLayout(new java.awt.GridLayout(5, 3, 10, 10));

        factorialButton.setText("!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(factorialButton);

        permutacionButton.setText("P");
        permutacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permutacionButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(permutacionButton);

        combinacionButton.setText("C");
        combinacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combinacionButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(combinacionButton);

        numero7Button.setText("7");
        numero7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero7Button);

        numero8Button.setText("8");
        numero8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero8Button);

        numero10Button.setText("9");
        numero10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero10ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero10Button);

        numero4Button.setText("4");
        numero4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero4Button);

        numero5Button.setText("5");
        numero5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero5Button);

        numero6Button.setText("6");
        numero6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero6Button);

        numero1Button.setText("1");
        numero1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero1Button);

        numero2Button.setText("2");
        numero2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero2Button);

        numero3Button.setText("3");
        numero3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero3Button);

        puntoDecimalButton.setText(".");
        puntoDecimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoDecimalButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(puntoDecimalButton);

        numero0Button.setText("0");
        numero0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(numero0Button);

        ansButton.setBackground(new java.awt.Color(255, 15, 0));
        ansButton.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        ansButton.setForeground(new java.awt.Color(254, 254, 246));
        ansButton.setText("Ans");
        ansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButtonActionPerformed(evt);
            }
        });
        botonesPanel.add(ansButton);

        botones2Panel.setLayout(new java.awt.GridLayout(4, 3, 10, 10));

        binarioButton.setText("Bin");
        botones2Panel.add(binarioButton);

        octalButton.setText("Oct");
        botones2Panel.add(octalButton);

        hexadecimalButton.setText("Hex");
        botones2Panel.add(hexadecimalButton);

        delButton.setBackground(new java.awt.Color(2, 52, 143));
        delButton.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        delButton.setForeground(new java.awt.Color(254, 254, 254));
        delButton.setText("DEL");
        botones2Panel.add(delButton);

        acButton.setBackground(new java.awt.Color(2, 52, 143));
        acButton.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        acButton.setForeground(new java.awt.Color(254, 254, 246));
        acButton.setText("AC");
        acButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(acButton);

        restoButton.setText("%");
        restoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(restoButton);

        divisionButton.setText("/");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(divisionButton);

        multiplicacionButton.setText("x");
        multiplicacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(multiplicacionButton);

        potenciaButton.setText("a^n");
        botones2Panel.add(potenciaButton);

        sumaButton.setText("+");
        sumaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(sumaButton);

        restaButton.setText("-");
        restaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(restaButton);

        raizButton.setText("√");
        raizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizButtonActionPerformed(evt);
            }
        });
        botones2Panel.add(raizButton);

        igualButton.setText("=");
        igualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualButtonActionPerformed(evt);
            }
        });

        operacionesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division", "Residuo", "Raiz", "Potencia", "Factorial", "Permutacion", "Combinacion", "Bases numericas" }));
        operacionesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionesComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Escoja su operacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(operacionesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(operacionesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operacionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botones2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(igualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(operacionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botones2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igualButton)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void igualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualButtonActionPerformed
        ArrayList<Double> numerosAOperarDecimales;
        ArrayList<Integer> numerosAOperarEnteros;

        //Operacion para suma
        if (this.operacionesComboBox.getSelectedItem().equals("Suma")) {
            numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "\\+");
            Suma nuevaSuma = new Suma(numerosAOperarDecimales);
            this.resultadoTextField.setText(nuevaSuma.getResultado().toString());

            //Operacion para resta
        } else if (this.operacionesComboBox.getSelectedItem().equals("Resta")) {
            numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "\\-");
            if (numerosAOperarDecimales.size() != 2) {
                this.resultadoTextField.setText("Ha ingresado mas de dos numeros");
            } else {
                Resta nuevaResta = new Resta(numerosAOperarDecimales.get(0), numerosAOperarDecimales.get(1));
                this.resultadoTextField.setText(nuevaResta.getDiferencia().toString());
            }

            //Operacion para multiplicacion    
        } else if (this.operacionesComboBox.getSelectedItem().equals("Multiplicacion")) {
            numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "\\*");
            Multiplicacion nuevaMultiplicacion = new Multiplicacion(numerosAOperarDecimales);
            this.resultadoTextField.setText(nuevaMultiplicacion.getResultado().toString());
        } //operacion para division
        else if (this.operacionesComboBox.getSelectedItem().equals("Division")) {
            numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "\\/");
            if (numerosAOperarDecimales.size() != 2) {
                this.resultadoTextField.setText("Ha ingresado mas de dos numeros");
            } else {
                Division nuevaDivision = new Division(numerosAOperarDecimales.get(0), numerosAOperarDecimales.get(1));
                this.resultadoTextField.setText(nuevaDivision.getCociente().toString());
            }
        } //operacion para residuo
        else if (this.operacionesComboBox.getSelectedItem().equals("Residuo")) {
            numerosAOperarEnteros = ManejadorDeCadenas.separarNumerosEnteros(this.operacionesTextField.getText(), "\\%");
            if (numerosAOperarEnteros.size() != 2) {
                this.resultadoTextField.setText("Ha ingresado mas de dos numeros");
            } else {
                Residuo nuevoResiduo = new Residuo(numerosAOperarEnteros.get(0), numerosAOperarEnteros.get(1));
                this.resultadoTextField.setText(String.valueOf(nuevoResiduo.getResiduo()));
            }
        } //Operacion para raiz
        else if (this.operacionesComboBox.getSelectedItem().equals("Raiz")) {
            numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "R");
            if (numerosAOperarDecimales.size() != 2) {
                this.resultadoTextField.setText("Ha ingresado mas de dos numeros");
            } else {
                Raiz nuevaRaiz = new Raiz(numerosAOperarDecimales.get(0), numerosAOperarDecimales.get(1));
                this.resultadoTextField.setText(nuevaRaiz.getResultado().toString());
            }

//Operacion Factorial
        } else if (this.operacionesComboBox.getSelectedItem().equals("Factorial")) {
            
            boolean iniciaConNumero = ManejadorTerminacionEnNumero.inicioConNumero(operacionesTextField);
            

            if (iniciaConNumero == true && operacionesTextField.getText().endsWith("!") ) {

                numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "!");
                double numeroAOperar = numerosAOperarDecimales.get(0);

                Factorial factorial = null;
                factorial = new Factorial().operacionFactorial(numeroAOperar);

                this.resultadoTextField.setText("" + factorial.getResultado());
            }else{
                this.resultadoTextField.setText("== Math Error ==");
            }

//Operacion Permutacion            
        } else if (this.operacionesComboBox.getSelectedItem().equals("Permutacion")) {

            boolean iniciaConNumero = ManejadorTerminacionEnNumero.inicioConNumero(operacionesTextField);
            boolean terminacionEnNumero = ManejadorTerminacionEnNumero.terminacionEnNumero(operacionesTextField);

            if (operacionesTextField.getText().contains("P") && iniciaConNumero == true && terminacionEnNumero == true) {

                numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "P");
                double n = numerosAOperarDecimales.get(0);
                double r = numerosAOperarDecimales.get(1);

                Permutacion permutacion = null;
                permutacion = new Permutacion().operacionPermutacion(n, r);

                if (permutacion == null) {
                    resultadoTextField.setText("== Math Error ==");
                    System.out.println("==== Math Error ====");
                    System.out.println("    Permutacion");
                } else {

                    this.resultadoTextField.setText("" + permutacion.getResultado());

                }

            }
        } else if (this.operacionesComboBox.getSelectedItem().equals("Combinacion")) {

            boolean iniciaConNumero = ManejadorTerminacionEnNumero.inicioConNumero(operacionesTextField);
            boolean terminacionEnNumero = ManejadorTerminacionEnNumero.terminacionEnNumero(operacionesTextField);

            if (operacionesTextField.getText().contains("C") && iniciaConNumero == true && terminacionEnNumero == true) {

                numerosAOperarDecimales = ManejadorDeCadenas.separarNumerosDecimales(this.operacionesTextField.getText(), "C");
                double n = numerosAOperarDecimales.get(0);
                double r = numerosAOperarDecimales.get(1);

                Combinacion combinacion = null;
                combinacion = new Combinacion().operacionCombinacion(n, r);

                if (combinacion == null) {
                    
                    resultadoTextField.setText("== Math Error ==");
                    System.out.println("==== Math Error ====");
                    System.out.println("    Combinacion");

                } else {

                    this.resultadoTextField.setText("" + combinacion.getResultado());

                }

            }
        }
    }//GEN-LAST:event_igualButtonActionPerformed

    //Se da accion a los botones de numeros donde se pueden activar
    private void puntoDecimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoDecimalButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Suma")
                || this.operacionesComboBox.getSelectedItem().equals("Resta")
                || this.operacionesComboBox.getSelectedItem().equals("Multiplicacion")
                || this.operacionesComboBox.getSelectedItem().equals("Division")
                || this.operacionesComboBox.getSelectedItem().equals("Raiz")
                || this.operacionesComboBox.getSelectedItem().equals("Potencia")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + ".");
        }
    }//GEN-LAST:event_puntoDecimalButtonActionPerformed

    private void numero0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "0");
    }//GEN-LAST:event_numero0ButtonActionPerformed

    private void numero1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "1");
    }//GEN-LAST:event_numero1ButtonActionPerformed

    private void numero2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "2");
    }//GEN-LAST:event_numero2ButtonActionPerformed

    private void numero3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "3");
    }//GEN-LAST:event_numero3ButtonActionPerformed

    private void numero4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "4");
    }//GEN-LAST:event_numero4ButtonActionPerformed

    private void numero5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "5");
    }//GEN-LAST:event_numero5ButtonActionPerformed

    private void numero6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "6");
    }//GEN-LAST:event_numero6ButtonActionPerformed

    private void numero7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "7");
    }//GEN-LAST:event_numero7ButtonActionPerformed

    private void numero8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "8");
    }//GEN-LAST:event_numero8ButtonActionPerformed

    private void numero10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero10ButtonActionPerformed
        this.operacionesTextField.setText(this.operacionesTextField.getText() + "9");
    }//GEN-LAST:event_numero10ButtonActionPerformed

    //Se da accion a los botones de las operaciones, se decide cuando podran ser usados
    private void operacionesTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operacionesTextFieldKeyTyped
        Character car = evt.getKeyChar();
        if (operacionesComboBox.getSelectedItem().equals("Suma")) {
            if ((car < '0' || car > '9') && (car < '+' || car > '+') && (car < '.' || car > '.')) {
                evt.consume();
            }
        } else if (operacionesComboBox.getSelectedItem().equals("Resta")) {
            if ((car < '0' || car > '9') && (car < '-' || car > '-') && (car < '.' || car > '.')) {
                evt.consume();
            }
        } else if (operacionesComboBox.getSelectedItem().equals("Multiplicacion")) {
            if ((car < '0' || car > '9') && (car < '*' || car > '.')) {
                evt.consume();
            }

        } else if (operacionesComboBox.getSelectedItem().equals("Division")) {//no da
            if ((car < '0' || car > '9') && (car < '/' || car > '/') && (car < '.' || car > '.')) {
                evt.consume();
            }

        } else if (operacionesComboBox.getSelectedItem().equals("Residuo")) {
            if ((car < '0' || car > '9') && (car < '%' || car > '%')) {
                evt.consume();
            }

        } else if (operacionesComboBox.getSelectedItem().equals("Raiz")) {
            if ((car < '0' || car > '9') && (car < 'R' || car > 'R') && (car < '.' || car > '.')) {
                evt.consume();
            }
        } else if (operacionesComboBox.getSelectedItem().equals("Factorial")) {
            if ((car < '0' || car > '9') && (car < '!' || car > '!')) {
                evt.consume();
            }
        } else if (operacionesComboBox.getSelectedItem().equals("Permutacion")) {
            if ((car < '0' || car > '9') && (car < 'P' || car > 'P')) {
                evt.consume();
            }
        } else if (operacionesComboBox.getSelectedItem().equals("Combinacion")) {
            if ((car < '0' || car > '9') && (car < 'C' || car > 'C')) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_operacionesTextFieldKeyTyped

    private void sumaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Suma")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "+");
        }
    }//GEN-LAST:event_sumaButtonActionPerformed

    private void restaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Resta")
                || this.operacionesComboBox.getSelectedItem().equals("Multiplicacion")
                || this.operacionesComboBox.getSelectedItem().equals("Division")
                || this.operacionesComboBox.getSelectedItem().equals("Residuo")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "-");
        }
    }//GEN-LAST:event_restaButtonActionPerformed

    private void multiplicacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Multiplicacion")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "*");
        }
    }//GEN-LAST:event_multiplicacionButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Division")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "/");
        }
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void restoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Residuo")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "%");
        }
    }//GEN-LAST:event_restoButtonActionPerformed

    private void raizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Raiz")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "R");
        }
    }//GEN-LAST:event_raizButtonActionPerformed

    private void ansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButtonActionPerformed
        if (!this.resultadoTextField.getText().isEmpty()) {
            this.operacionesTextField.setText(this.resultadoTextField.getText());
            this.resultadoTextField.setText("");
        }
    }//GEN-LAST:event_ansButtonActionPerformed

    private void operacionesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionesComboBoxActionPerformed
        this.operacionesTextField.setText("");
    }//GEN-LAST:event_operacionesComboBoxActionPerformed

    private void acButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acButtonActionPerformed
        operacionesTextField.setText("");
        resultadoTextField.setText("");
    }//GEN-LAST:event_acButtonActionPerformed

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Factorial")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "!");
        }
    }//GEN-LAST:event_factorialButtonActionPerformed

    private void permutacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permutacionButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Permutacion")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "P");
        }
    }//GEN-LAST:event_permutacionButtonActionPerformed

    private void combinacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combinacionButtonActionPerformed
        if (this.operacionesComboBox.getSelectedItem().equals("Combinacion")) {
            this.operacionesTextField.setText(this.operacionesTextField.getText() + "C");
        }
    }//GEN-LAST:event_combinacionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acButton;
    private javax.swing.JButton ansButton;
    private javax.swing.JButton binarioButton;
    private javax.swing.JPanel botones2Panel;
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton combinacionButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JButton hexadecimalButton;
    private javax.swing.JButton igualButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacionButton;
    private javax.swing.JButton numero0Button;
    private javax.swing.JButton numero10Button;
    private javax.swing.JButton numero1Button;
    private javax.swing.JButton numero2Button;
    private javax.swing.JButton numero3Button;
    private javax.swing.JButton numero4Button;
    private javax.swing.JButton numero5Button;
    private javax.swing.JButton numero6Button;
    private javax.swing.JButton numero7Button;
    private javax.swing.JButton numero8Button;
    private javax.swing.JButton octalButton;
    private javax.swing.JComboBox<String> operacionesComboBox;
    private javax.swing.JPanel operacionesPanel;
    private javax.swing.JTextField operacionesTextField;
    private javax.swing.JButton permutacionButton;
    private javax.swing.JButton potenciaButton;
    private javax.swing.JButton puntoDecimalButton;
    private javax.swing.JButton raizButton;
    private javax.swing.JButton restaButton;
    private javax.swing.JButton restoButton;
    private javax.swing.JTextField resultadoTextField;
    private javax.swing.JButton sumaButton;
    // End of variables declaration//GEN-END:variables
}
