Coffe Uygulaması Temel Yapı:

Model => Burada kahve türleri,yapıları ve ortak davranışları tanımlanmıştır.
Factory => Burası kahve nesnelerini yaratır.
Service => Burada kullanıcıdan girişler alınır ve sipariş ile üretim sağlanır.
Main => Uygulama başlatma noktasıdır.

Uygulamada uygulanan prensipler ve tasarım desenleri;

S - Single Responsibility (Tek Sorumluluk);
     OrderService, CoffeeFactory, BaseCoffee, Coffee. Her sınıf sadece bir şeyden sorumludur: sipariş alma,      kahve üretme, tarifi taşıma gibi.

O - Open/Closed (Açık/Kapalı);
      CoffeeFactory, Coffee interface. Yeni kahve türü eklendiğinde var olan kod değişmez, sadece genişletilir.
      
L - Liskov Substitution;
      Coffee interface ve BaseCoffee türevleri. Tüm kahve türleri, Coffee yerine sorunsuz geçebilir.
      
I - Interface Segregation;
     Coffee interface sadece gereken metotları içerir. Kullanıcı istemediği metotlarla uğraşmaz.
     
D - Dependency Inversion;
OrderService → CoffeeFactory ve Coffee arayüzü. Yüksek seviyeli sınıflar alt seviye detaylara değil, soyutlamalara bağımlıdır.


Factory Pattern;

CoffeeFactory, Kahve üretimini soyutladık. Yeni kahve türü eklendiğinde sadece bu sınıfa ek yapılır.

Polymorphism;

Coffee interface ve alt sınıflar, her kahve türü kendi getRecipe() davranışını kendisi tanımlar.

Template-like structure;

BaseCoffee, ortak davranışlar bu sınıfa alınarak alt sınıflarda tekrar önlendi.

BaseCoffe neden abstract class olarak oluşturuldu;

   Her kahvenin adı ve fiyatı yani ortak alanları mevcuttur bunları hepsine getter metodları tanımlamak yerine ortak davranışlar bir soyut sınıf yazılarak burada toplandı. 
   BaseCoffe sınıfının kendisinden nesne oluşturulması anlamsız çünkü sistemde yalnızca belirli kahve türleri olmalı, bu nedenle bunu engellemek için abstract class oluşturuldu.
