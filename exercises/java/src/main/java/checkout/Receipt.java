package checkout;

public class Receipt {

    private String text = "";
    private int aCountdown = 3;
    private int total;
    private int bCountdown = 2;
    private int cCountdown = 4;
    String text() {

        return text + "Total: " + total;
    }

    public void scannedA() {
        text += "A: 50";
        if (--aCountdown == 0) {
            text += " - 20 (3 for 130)";
            total += 30;
        } else {
            total += 50;
        }
        text += "\n";
        System.out.println("text = " + text);
    }

    public void scannedB() {
        text += "B: 30";
        if (--bCountdown == 0) {
            text += " - 15 (2 for 45)";
            total += 15;
        } else {
            total += 30;
        }
        text += "\n";
    }

    public void scannedC() {
        text += "C: 20\n";
        if(--cCountdown == 0){
            text += " - 10 (4 for 80)";
            total += 20;
        }
        text += "\n";
    }

    public void scannedD() {
        text += "D: 15\n";
        total += 15;
    }
}
