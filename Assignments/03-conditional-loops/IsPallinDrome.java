����   A A
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  Enter the Number : 
      java/io/PrintStream print (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     ! nextInt ()I # Is a PallinDrome
  % &  println ( Is not a PallinDrome * IsPallinDrome Code LineNumberTable LocalVariableTable this LIsPallinDrome; main ([Ljava/lang/String;)V digit I i args [Ljava/lang/String; sc Ljava/util/Scanner; num temp 	numLength ans StackMapTable 6 
SourceFile IsPallinDrome.java ! )           +   /     *� �    ,        -        . /   	 0 1  +  K     p� � � Y� � L+� =>6� 
l>����>66� 
p6
h`6
l>����� � "� $� � '� $�    ,   N            	  
 !  &  ,  .  1  ;  A  K  P  V  \  g  o  -   R  A  2 3  4 " 4 3    p 5 6    ] 7 8   X 9 3   V : 3   S ; 3  1 ? < 3  =    �   >   � � !  ?    @