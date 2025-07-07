package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Produto {

    private String codigoProduto;
    private String descricaoProduto;
    private float valor;
    private LocalDate validade;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Produto() {
    }


    // Getters e Setters
    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public void preencherProduto(Scanner input){
        System.out.println("Digite o valor do produto: ");
        this.valor = input.nextFloat();

        input.nextLine(); //Limpar o buffer

        System.out.println("Digite a descricao do produto: ");
        this.descricaoProduto = input.nextLine();


        while(true){
            System.out.println("Digite o validade do produto: ");
            String entradaData = input.nextLine();
            try{
                this.validade = LocalDate.parse(entradaData, formatter);
                break;
            }catch(DateTimeParseException e){
                System.out.println("Data inválida! Tente novamente");
            }
        }
    }
}
