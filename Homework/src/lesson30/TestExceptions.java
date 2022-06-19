package lesson30;

public class TestExceptions {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
            tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println("NeVodaException vnytrenniy: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }finally {
                System.out.println("Eto inner finally block");
            }
        }catch (RuntimeException e){
            System.out.println("RuntimeException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


class NeMyasoException extends RuntimeException {
    NeMyasoException(String param) {
        super(param);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String param) {
        super(param);
    }
}

class Tiger {
    void eat(String param) {
        if (!param.equals("myaso")) throw new NeMyasoException("Tigr ne est - " + param);
        else System.out.println("Tigr est myaso");
    }

    void drink(String param) throws NeVodaException {
        if (!param.equals("voda")) throw new NeVodaException("Tigr ne pyet - " + param);
        else System.out.println("Tigr pyet vodu");
    }
}