# Selection Sort Example

Selection sort, sıralama algoritmalarından biridir ve basit bir yaklaşımı olan bir algoritmadır. Bu algoritma, sıralanacak dizideki en küçük (ya da en büyük) elemanı bulup, onu dizinin başına yerleştirmeyi sürdürerek çalışır. Ardından, sıralanan kısmın dışındaki kalan dizide en küçük (ya da en büyük) elemanı bulup, sıralı kısmın hemen sonrasına ekler. Bu işlem, dizideki tüm elemanlar sıralanana kadar devam eder.

## Adımlar

1. Dizinin tamamını tarayarak en küçük (ya da en büyük) elemanı bul.
2. Bulunan elemanı dizinin başındaki (ya da sonundaki) eleman ile yer değiştir.
3. Sıralanan kısmın dışında kalan diziyi al ve en küçük (ya da en büyük) elemanı bulmak için adımları tekrarla.
4. Tüm diziyi sıralayana kadar bu işlemi tekrarla.

Selection sort, sıralama işlemini yapılan karşılaştırmalara ve yer değiştirmelere bağlı olarak O(n^2) zaman karmaşıklığına sahiptir. Diğer sıralama algoritmalarına göre daha yavaş olabilir, ancak kodunun basit olması ve ekstra bellek kullanmaması nedeniyle bazı durumlarda tercih edilebilir.

## Programın Amacı

Program öncelikle kişinin özniteliklerini içeren bazı değerleri nesnesine atar ve her bir öznitelik başlığına göre sıralama işlemini gerçekleştirir. Tüm sıralama işlemi Türkçe alfabetik sıralama ile gerçekleştirilir.

## Depoda Bulunan Dosyalar

- `src`
  - `SelectionSortExample`
    - `model`
      - `Person.java`
    - `util`
      - `DefineValuesPerson.java`
      - `ShowProcessPerson.java`
    - `selectionsort`
      - `SelectionSortPerson.java`
    - `Main.java`
    - `SelectionSort.java`


## File Description

| Dosya Adları                | Bilgi                                                   |
|-----------------------------|---------------------------------------------------------|
| SelectionSortPerson.java    | SelectionSort Sıralama İşlemini Türkçe alfabetik sıraya göre uygulama |
| Person.java                 | POJO olarak tanımlama                                   |
| Main.java                   | Programı çalıştırmak ve test etmek için dosya           |
| ShowProcessPerson.java      | Kişi nesnesi hakkındaki tüm bilgileri çıktı olarak gösterme |
| DefineValuesPerson.java     | Niteliklerinin çalışan nesnesine doldurulması           |


[![selectionsortexample](https://r.resimlink.com/dDTWV3Ff.png)](https://resimlink.com/dDTWV3Ff)
