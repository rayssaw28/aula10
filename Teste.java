/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves.go@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exAula10;
import java.util.*;

/**
 *
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 13/03/2024
 * @brief Class Teste
 */
public class Teste {

   public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       while (true) {
           System.out.println();
           System.out.println("Escolha uma figura:");
           System.out.println("1 - Quadrado");
           System.out.println("2 - Triângulo");
           System.out.println("3 - Círculo");
           System.out.println("4 - Retângulo");
           System.out.println("0 - Sair");

           int opcao = scanner.nextInt();
            
   switch (opcao) {
               case 0:
                   return;
               case 1:
                   System.out.println("Digite a cor do quadrado:");
                   String corQ = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o lado do quadrado:");
                   double ladoQ = scanner.nextDouble();
                   Quadrado quadrado = new Quadrado();
                   quadrado.setCor(corQ);
                   quadrado.setLado1(ladoQ);
                   System.out.println("Figura criada: " + quadrado);
                   break;
               case 2:
                   System.out.println("Digite a cor do triângulo:");
                   String corT = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite a base do triângulo:");
                   double baseT = scanner.nextDouble();
                   System.out.println("Digite a altura do triângulo:");
                   double alturaT = scanner.nextDouble();
                   Triangulo triangulo = new Triangulo(corT, baseT, alturaT);
                   System.out.println("Figura criada: " + triangulo);
                   break;
               case 3:
                   System.out.println("Digite a cor do círculo:");
                   String corC = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o raio do círculo:");
                   double raioC = scanner.nextDouble();
                   Circulo circulo = new Circulo(corC, raioC);
                   System.out.println("Figura criada: " + circulo);
                   break;
               case 4:
                   System.out.println("Digite a cor do retângulo:");
                   String corR = scanner.next();
                   scanner.nextLine();
                   System.out.println("Digite o lado 1 do retângulo:");
                   double lado1R = scanner.nextDouble();
                   System.out.println("Digite o lado 2 do retângulo:");
                   double lado2R = scanner.nextDouble();
                   Retangulo retangulo = new Retangulo(corR, lado1R, lado2R);
                   System.out.println("Figura criada: " + retangulo);
                   break;
               default:
                   System.out.println("Opção inválida.");
                   continue;
           }
       }
   }
}
