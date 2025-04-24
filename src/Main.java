import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;
        
        do {
            System.out.println("\n1. ␣ Inserir\n2. ␣ Remover\n3. ␣ Pesquisar\n4. ␣ EmOrdem\n5. ␣ PreOrdem\n6. ␣ PosOrdem\n7. ␣ Verificar ␣ Tipo ␣ da ␣ Árvore\n8. ␣ Grau ␣ de ␣ um ␣ Nó\n9. ␣ Nível ␣ da ␣ Árvore\n0. ␣ Sair");
            System.out.print("Escolha: ␣ ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Valor: ␣ ");
                    valor = scanner.nextInt();
                    arvore.inserir(valor);
                    break;
                case 2:
                    System.out.print("Valor: ␣ ");
                    valor = scanner.nextInt();
                    arvore.remover(valor);
                    break;
                case 3:
                    System.out.print("Valor: ␣ ");
                    valor = scanner.nextInt();
                    System.out.println(arvore.pesquisar(valor) ? "Encontrado!" : "Não ␣ encontrado.");
                    break;
                case 4:
                    arvore.emOrdem();
                    break;
                case 5:
                    arvore.preOrdem();
                    break;
                case 6:
                    arvore.posOrdem();
                    break;
                case 7:
                    System.out.println("Completa: ␣ " + arvore.ehCompleta());
                    System.out.println("Cheia: ␣ " + arvore.estaCheia());
                    System.out.println("Estrita: ␣ " + arvore.ehEstrita());
                    break;
                case 8:
                    System.out.print("Valor: ␣ ");
                    valor = scanner.nextInt();
                    int grau = arvore.obterGrau(valor);
                    if (grau == -1)
                        System.out.println("Não ␣ encontrado.");
                    else
                        System.out.println("Grau: ␣ " + grau);
                    break;
                case 9:
                    System.out.println("Nível ␣ da ␣ árvore: ␣ " + arvore.nivel());
                    break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
