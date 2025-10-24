package com.korit.study.ch27;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public class UserPrinter {
        private String printValue;

        public UserPrinter(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }


        @Override
        public String toString() {
            return "UserPrinter{" +
                    "printValue='" + printValue + '\'' +
                    '}';
        }
    }

    public static class UserPrinter2 {
        private String printValue;

        public UserPrinter2(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }


        @Override
        public String toString() {
            return "UserPrinter{" +
                    "printValue='" + printValue + '\'' +
                    '}';
        }
    }


}
