package NeuronalesNetzwerk;

import java.util.Random;

public class ANN {

    private double[] input;
    private double[] output;
    private float[] weight;



    public ANN(int inputNR, int[] hiddenLayer, int outputNR){

        Random ran = new Random();
        int min = -1;
        int max = 1;

        double weight[]=new double[hiddenLayer.length+1];
        double bias[]=new double[hiddenLayer.length];
        this.input= new double[inputNR];
        this.output= new double[outputNR];


        for (int i =0;i<weight.length;i++){
            weight[i]=min + ran.nextInt(max - min + 1);
            bias[i] = min + ran.nextInt(max - min + 1);
        }
    }

    public void calculateLayer(double[] y){



        for (int i =0;i<weight.length;i++){
            double x = Matrix.sigmoid(weight[i]*input[i]+bias[i]);
        }


    }






}
