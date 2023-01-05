public class Mensagens {
    
    public static String getMensagem(int horario){

        if(horario > 6 && horario < 12) return "Bom dia!";
        else if(horario >= 12 && horario <= 18) return "Boa tarde!";
        else if(horario > 18 && horario <= 24) return "Boa noite";
        else if(horario >= 0 && horario <= 6) return "Boa noite";
        else return "Horário Inválido!";

    }

}
