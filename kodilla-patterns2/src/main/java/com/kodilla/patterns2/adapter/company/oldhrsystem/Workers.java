package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] worksers = {
            {"67032906720", "John", "Smith"},
            {"62081612187", "Ivone", "Novak"},
            {"75021310799", "Jessie", "James"},
            {"75012200766", "Walter", "White"},
            {"75073006831", "Clara", "Larnson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return worksers[n][0] + ", " + worksers[n][1] + ", " + worksers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorksers() {
        return worksers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
