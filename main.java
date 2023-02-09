//projecto de programação orientada a objectos
//Sistema de gestão de estudantes
//Grupo: 1 - Ano 0 - 2022/2023 - Margarida Costa,...

package main;

import java.util.Scanner;

private class Student{
    private String turma;
    private int numEstudante;
    private String nome;
    private int notaALG;
    private int notaJAVA;
    private int notaVB;
    
    public Student(String turma, int numEstudante, String nome, int notaALG, int notaJAVA, int notaVB){
        this.turma = turma;
        this.numEstudante = numEstudante;
        this.nome = nome;
        this.notaALG = notaALG;
        this.notaJAVA = notaJAVA;
        this.notaVB = notaVB;
    }
    
    public String getTurma(){
        return turma;
    }
    
    public int getNumEstudante(){
        return this.numEstudante;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNotaALG(){
        return this.notaALG;
    }
    
    public int getNotaJAVA(){
        return this.notaJAVA;
    }
    
    public int getNotaVB(){
        return this.notaVB;
    }
    
    public void setTurma(String turma){
        this.turma = turma;
    }
    
    public void setNumEstudante(int numEstudante){
        this.numEstudante = numEstudante;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNotaALG(int notaALG){
        this.notaALG = notaALG;
    }
    
    public void setNotaJAVA(int notaJAVA){
        this.notaJAVA = notaJAVA;
    }
    
    public void setNotaVB(int notaVB){
        this.notaVB = notaVB;
    }
    
    public String toString(){
        return "Turma: " + this.getTurma + "Número de estudante: " + this.getNumEstudante + "Nome: " + this.getNome + "Nota ALG: " + this.getNotaALG + "Nota JAVA: " + this.getNotaJAVA + "Nota VB: " + this.getNotaVB;
    }
}  

private class StudentList{
    private Student[] students;
    private int numStudents;
        
        public StudentList(int maxStudents){
            students = new Student[maxStudents];
            numStudents = 0;
        }
        
        public void addStudent(Student student){
            students[numStudents] = student;
            numStudents++;
        }
        
        public void removeStudent(int numEstudante){
            for(int i = 0; i < numStudents; i++){
                if(students[i].getNumEstudante() == numEstudante){
                    for(int j = i; j < numStudents - 1; j++){
                        students[j] = students[j + 1];
                    }
                    numStudents--;
                    break;
                }
            }
        }
        
        public void editStudent(int numEstudante, Student student){
            for(int i = 0; i < numStudents; i++){
                if(students[i].getNumEstudante() == numEstudante){
                    students[i] = student;
                    break;
                }
            }
        }
        
        public Student getStudent(int numEstudante){
            for(int i = 0; i < numStudents; i++){
                if(students[i].getNumEstudante() == numEstudante){
                    return students[i];
                }
            }
            return null;
        }
        
        public void printStudents(){
            for(int i = 0; i < numStudents; i++){
                System.out.println(students[i].toString());
            }
        }
    }

public FileIO{
    public static void saveStudents(StudentList students){
        try{
            FileOutputStream file = new FileOutputStream("students.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(students);
            out.close();
            file.close();
        }catch(IOException e){
            System.out.println("Erro ao guardar os estudantes");
        }
    }
    public static void loadStudents(StudentList students){
        try{
            FileInputStream file = new FileInputStream("students.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            students = (StudentList) in.readObject();
            in.close();
            file.close();
        }catch(IOException e){
            System.out.println("Erro ao carregar os estudantes");
        }catch(ClassNotFoundException e){
            System.out.println("Erro ao carregar os estudantes");
        }
    }
}

public class Main {
    //função para adicionar estudante
    private AddStudent{
        Student student = new Student();
        System.out.println("Adicionar estudante");
        System.out.println("Turma: ");
        student.setTurma (input.nextLine());
        System.out.println("Número de estudante: ");
        student.setNumEstudante(input.nextInt());
        System.out.println("Nome: ");
        student.setNome(input.nextLine());
        System.out.println("Nota ALG: ");
        student.setNotaALG(input.nextInt());
        System.out.println("Nota JAVA: ");
        student.setNotaJAVA(input.nextInt());
        System.out.println("Nota VB: ");  
        student.setNotaVB(input.nextInt());

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1 - Adicionar estudante");
            System.out.println("2 - Editar estudante");
            System.out.println("3 - Apager estudante");
            System.out.println("4 - Listar estudantes");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Adicionar estudante");
                    break;
                case 2:
                    System.out.println("Editar estudante");
                    break;
                case 3:
                    System.out.println("Apagar estudante");
                    break;
                case 4:
                    System.out.println("Listar estudantes");
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 5);    
        }
}

