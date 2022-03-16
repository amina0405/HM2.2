package com.company;

   public abstract class Dad implements Printable {
   private String name;
   private int age;

      public Dad(String name, int age) {
         this.name = name;
         this.age = age;
      }

      public String getName() {
         return name;
      }

      public int getAge() {
         return age;
      }
   }
