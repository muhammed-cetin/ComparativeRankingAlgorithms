# Quick Sort Example

Quick Sort algoritması "böl ve yönet" prensibi üzerine kurulmuştur ve pivot mantığı ile çalışır. Algoritmanın temel prensibi, bir pivot eleman seçip bu pivot elemanın etrafındaki diğer elemanları buna göre sıralamaktır. Pivot eleman, diziyi iki alt diziye bölmek için kullanılır. Bu alt diziler, pivot elemanın solundaki elemanlardan oluşan bir alt dizi ve sağundaki elemanlardan oluşan bir alt dizi olarak düzenlenir.

Pivot elemanın seçimi ve bu elemanın etrafındaki elemanların düzenlenmesi, algoritmanın verimliliğini belirler. Genellikle pivot eleman olarak orta eleman, ilk eleman veya son eleman seçilebilir. Seçim stratejisi algoritmaya bağlı olarak değişebilir.

Pivot mantığı, algoritmanın zaman karmaşıklığını düşük tutmaya ve hızlı sıralama yapmaya olanak tanır. Ancak, eğer kötü bir pivot seçilirse (örneğin, dizinin ortasındaki eleman her zaman en küçük veya en büyük değeri temsil ediyorsa), algoritmanın performansı düşebilir. Bu nedenle, pivot seçimi önemli bir konudur ve optimize edilmesi gerekebilir.

## Programın Amacı

Program başlangıçta bir kişinin nitelikleri de dahil olmak üzere bazı değerleri nesnesine atar ve her bir nitelik başlığına göre sıralama işlemini gerçekleştirir. Tüm sıralama işlemleri Türkçe alfabetik sıra kullanılarak gerçekleştirilir.

## Depoda Bulunan Dosyalar

- `src`
  - `QuickSortExample`
    - `model`
      - `Human.java`
    - `util`
      - `DefineValuesHuman.java`
      - `ShowProcessHuman.java`
    - `quicksort`
      - `QuickSortHuman.java`
    - `Main.java`
    - `QuickSort.java`


## File Description

| Dosya Adları                | Bilgi                                                   |
|-----------------------------|---------------------------------------------------------|
| QuickSortHuman.java         | QuickSort Sıralama İşlemini Türkçe alfabetik sıraya göre uygulama |
| Human.java                  | POJO olarak tanımlama                                   |
| Main.java                   | Programı çalıştırmak ve test etmek için dosya           |
| ShowProcessHuman.java       | İnsan nesnesi hakkındaki tüm bilgileri çıktı olarak gösterme |
| DefineValuesHuman.java      | Niteliklerinin insan nesnesine doldurulması           |


[![quicksortexample](https://r.resimlink.com/hL2AuzsSEf.png)](https://resimlink.com/hL2AuzsSEf)
