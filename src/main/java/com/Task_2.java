package com;

public class Task_2 {
    int factorial;

    public Task_2(int factorial) {
        this.factorial = factorial;
    }

    public int findNumber() {
        int answer=1;
        int fac=this.factorial;
        while (answer!=fac){
            if(fac%answer==0) {
                fac /= answer;
                answer++;
            }else {
                System.err.println("Wrong data. Input other number");
                return 0;
            }
        }
        return answer;
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
}
