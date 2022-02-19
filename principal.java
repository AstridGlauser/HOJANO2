
//Astrid Marie Glauser Oliva 21299
//Segunda hoja de trabajo
//Seccion 20
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Vector;
import java.util.Scanner;
//importacion de las librerias correspondientes

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//scanner
        PosfixCalc Calculadora = new PosfixCalc();//creacion del nuevo objeto de tipo calculadora
        Vector<String> info = new Vector<String>();//almacenara la informacion del archivo

        try {
            System.out.println("Por favor,ingresa la ruta del archivo");
            String archiv = entrada.nextLine();//guarda la ruta del archivo
            FileReader Datos = new FileReader(archiv);//lee el archivo
            BufferedReader Lector = new BufferedReader(Datos);
            String x = "";
            while (x != null) {
                x = Lector.readLine();//se lee linea por linea
                if (x == null) {
                    Lector.close();//para al no encontrar informacion
                    break;
                }
                info.add(x);//agrega al vector info
            }

        } catch (Exception e) {
            System.out.println("Ruta incorrecta");//capta la excepcion
        }

        for (int i = 0; i < info.size(); i++) {//recorre el vector
            int Total = Calculadora.Evaluate(info.get(i));//devuelve un entero que almacena en la variable total
            if (Calculadora.condicion) {//evalua que la condicion no sea falsa
                System.out.println("No. " + (i + 1) + ": " + Total);
            }

        }

    }

}
