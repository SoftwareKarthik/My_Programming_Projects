package com.method;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Karthik";

        // length()
        System.out.println("length(): " + name.length());

        // charAt(int index)
        System.out.println("charAt(1): " + name.charAt(1));

        // substring(int, int)
        System.out.println("substring(1,4): " + name.substring(1, 4));

        String s1 = "Java";
        String s2 = "java";

        // equals()
        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("equals(): " + s1.equals("Java"));

        // toUpperCase()
        System.out.println("toUpperCase(): " + name.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase(): " + name.toLowerCase());

        String input = "YES";

        // equalsIgnoreCase()
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("equalsIgnoreCase(): User agreed.");
        }

        String a = "apple";
        String b = "banana";

        // compareTo()
        int result = a.compareTo(b);
        System.out.println("compareTo(): " + result);

        String name1 = "  John Doe  ";

        // trim()
        System.out.println("trim(): '" + name1.trim() + "'");

        String url = "https://example.com";

        // startsWith()
        if (url.startsWith("https://")) {
            System.out.println("startsWith(): Secure URL");
        }

        String file = "document.pdf";

        // endsWith()
        if (file.endsWith(".pdf")) {
            System.out.println("endsWith(): This is a PDF file.");
        }

        String email = "user@example.com";

        // indexOf()
        int atPos = email.indexOf('@');
        System.out.println("indexOf('@'): " + atPos);

        String filename = "holiday.photo.jpg";

        // lastIndexOf()
        int dotPos = filename.lastIndexOf('.');

        // substring(int)
        String extension = filename.substring(dotPos + 1);
        System.out.println("lastIndexOf() and substring(): File extension: " + extension);

        String emailBody = "Please review the urgent report.";

        // contains()
        if (emailBody.contains("urgent")) {
            System.out.println("contains(): This email is marked urgent.");
        }

        String date = "2025-06-01";

        // replace()
        String formattedDate = date.replace("-", "/");
        System.out.println("replace(): Formatted date: " + formattedDate);

        String csv = "red,green,blue";

        // split()
        String[] colors = csv.split(",");
        System.out.println("split(): Colors:");
        for (String color : colors) {
            System.out.println(" - " + color);
        }

        int score = 95;

        // valueOf()
        String message = "Your score is " + String.valueOf(score);
        System.out.println("valueOf(): " + message);

        String input1 = "";

        // isEmpty()
        if (input1.isEmpty()) {
            System.out.println("isEmpty(): Input is empty.");
        }

        // join()
        String joined = String.join(", ", "apple", "banana", "cherry");
        System.out.println("join(): " + joined);

        String s11 = new String("hello");

        // intern()
        String s21 = s11.intern();
        String s3 = "hello";
        System.out.println("intern(): " + (s21 == s3));

        String phone = "123-456-7890";

        // matches()
        boolean valid = phone.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println("matches(): " + valid);
    }
}
