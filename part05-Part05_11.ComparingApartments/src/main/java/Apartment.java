
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.totalPrice = squares * pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int priceDifference = totalPrice - compared.totalPrice;
        if (priceDifference < 0){
            return priceDifference * -1;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (totalPrice > compared.totalPrice){
            return true;
        }
        return false;
    }
}