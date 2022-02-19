//Astrid Marie Glauser Oliva 21299
//Segunda hoja de trabajo
//Seccion 20


public class PosfixCalc implements IPosfixCalc {
    boolean condicion = true;
    int resultado = 0;
    int s = 0;
    int a = 0, b = 0;//inicializacion de las variables
    String fl = "";
    StackArrayList<Integer> mistack = new StackArrayList<Integer>();

    @Override
    public int Evaluate(String expresion) {//recibe un string y devuelve un entero
        String[] datos;//arreglo datos
        datos = expresion.split(" ");// separa el string
        try {
            for (int i = 0; i < datos.length; i++) {//recorre el arreglo
//evalua y compara 
                if (datos[i].equals("+")) {
                    if (mistack.count() >= 2) {
                        a = mistack.pull();
                        b = mistack.pull();
                        resultado = a + b;
//push o pop(pull) segun sea el caso
                        mistack.push(resultado);
                        condicion = true;

                    } else {
                        condicion = false;
                        mistack.push(Integer.parseInt(datos[i]));
                    }
                } else if (datos[i].equals("-")) {
                    if (mistack.count() >= 2) {
                        a = mistack.pull();
                        b = mistack.pull();
                        resultado = b - a;
                        mistack.push(resultado);
                        condicion = true;

                    } else {
                        condicion = false;
                        mistack.push(Integer.parseInt(datos[i]));
                    }
                }

                else if (datos[i].equals("*")) {
                    if (mistack.count() >= 2) {
                        a = mistack.pull();
                        b = mistack.pull();
                        resultado = a * b;

                        mistack.push(resultado);
                        condicion = true;
                    } else {
                        condicion = false;
                        mistack.push(Integer.parseInt(datos[i]));
                    }
                } else if (datos[i].equals("/")) {
                    if (mistack.count() >= 2) {
                        try {
                            if (b == 0) {
                                System.out.println("No esta definido");
                            } else {
                                if (mistack.count() >= 2) {
                                    a = mistack.pull();
                                    b = mistack.pull();
                                    resultado = b / a;
                                    mistack.push(resultado);
                                    condicion = true;
                                } else {
                                    condicion = false;
                                    mistack.push(Integer.parseInt(datos[i]));
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error al intentar dividir entre cero!");
                        }
                    }
                }

                else if (datos[i].equals("(") || datos[i].equals(")")) {
                    System.out.println("No se permite el uso de parentesis");
                    condicion = false;
                }

                else {
                    condicion = false;

                    mistack.push(Integer.parseInt(datos[i]));
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sintaxis");
        }
        if (condicion == true) {
            s = mistack.pull();

        } else if (condicion == false) {//capta excepciones
            System.out.println("Error");

        }

        return s;//retorna el entero

    }
}
