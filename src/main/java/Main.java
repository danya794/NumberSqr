import ru.netology.sqr.numbersq.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSQRS(10, 99));
    }
}


