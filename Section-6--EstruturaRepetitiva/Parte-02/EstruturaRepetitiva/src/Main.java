//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    //EX01
    /*int entrada = sc.nextInt();

    for (int i = 0; i <= entrada; i++ ){
        if(i%2 !=0){
            System.out.println(i);
        }
    }*/

    //EX02
    /*int n = sc.nextInt();
    int x = 0;
    int in = 0;
    int out =0;

    for(int i =1; i <= n;i++){
        x = sc.nextInt();
        if(x >= 10 && x <= 20){
            in++;
        }else {
            out++;
        }
    }
    System.out.printf("%d in %n" + "%d out",in,out);*/

    //EX03

    int n = sc.nextInt();
    for (int i = 1; i <= n; i++){
        String entrada = sc.nextLine();

        String[] partes = entrada.split(" ");
        double casoTeste01 = Double.parseDouble(partes[0]);
        double casoTeste02 = Double.parseDouble(partes[1]);
        double casoTeste03 = Double.parseDouble(partes[2]);

        double soma = (casoTeste01*2)

    };




}
