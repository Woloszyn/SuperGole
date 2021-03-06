/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperGole.control;

import SuperGole.model.Bebidas;
import java.util.ArrayList;

/**
 *
 * @author vinny
 */
public class MecanicaPC {
    protected ArrayList<Bebidas> maoPc = new ArrayList<Bebidas>();
    protected static double mediaPreco = 46.11d; // Menor
    protected static double mediaTeorAlcoolico = 27.86d; // Maior
    protected static double mediaAmnesia = 57.17d; // Maior
    protected static double mediaGosto = 39.35d; // Maior
    protected static double mediaCustoBeneficio = 48.5d; // Maior
    protected static int maiorId = 0;

    public MecanicaPC() {
    }
    
    
    
    public static int verificarId(ArrayList<Bebidas> mao){
        for (int i = 0; i < 5; i++) {
            if(mao.get(i).getId() > maiorId){
                maiorId = mao.get(i).getId();
            }
        }
        return maiorId;
    }

    public ArrayList<Bebidas> getMaoPc() {
        return maoPc;
    }

    public static double getMediaPreco() {
        return mediaPreco;
    }

    public static double getMediaTeorAlcoolico() {
        return mediaTeorAlcoolico;
    }

    public static double getMediaAmnesia() {
        return mediaAmnesia;
    }

    public static double getMediaGosto() {
        return mediaGosto;
    }

    public static double getMediaCustoBeneficio() {
        return mediaCustoBeneficio;
    }

    public static int getMaiorId() {
        return maiorId;
    }

    
    public static String verificarAtributo(Bebidas carta){
        double maiorDiferenca = 0;
        String atributoSelecionado = "";
        
        if((carta.getPreco() < mediaPreco) && ((mediaPreco - carta.getPreco()) > maiorDiferenca )){
            maiorDiferenca = mediaPreco - carta.getPreco();
            atributoSelecionado = "Preco";
        }
        if((carta.getGosto() > mediaGosto) && ((carta.getGosto() - mediaGosto) > maiorDiferenca)){
            maiorDiferenca = carta.getGosto() - mediaGosto;
            atributoSelecionado = "Gosto";
        }
        if((carta.getTeorAlco() > mediaTeorAlcoolico) && ((carta.getTeorAlco() - mediaTeorAlcoolico) > maiorDiferenca)){
            maiorDiferenca = carta.getTeorAlco() - mediaTeorAlcoolico;
            atributoSelecionado = "TeorAlcoolico";
        }
        if((carta.getAmnesia()> mediaAmnesia) && (carta.getAmnesia()- mediaAmnesia) > maiorDiferenca){
            maiorDiferenca = carta.getAmnesia()- mediaAmnesia;
            atributoSelecionado = "Amnesia";
        }
        if((carta.getCustBene()> mediaCustoBeneficio) && (carta.getCustBene()- mediaCustoBeneficio) > maiorDiferenca){
            maiorDiferenca = carta.getCustBene()- mediaCustoBeneficio;
            atributoSelecionado = "CustoBeneficio";
        }
        return atributoSelecionado;
    }

}
