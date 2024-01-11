# Merge Sort Example

Merge sort, sıralama algoritmalarından biridir ve **böl ve yönet** (divide and conquer) stratejisini temel alır. Bu strateji, büyük bir problemi daha küçük ve yönetilebilir alt problemlere bölerek çözmeye çalışır. Merge sort, aşağıdaki adımları içeren bir algoritmadır:

1. **Bölme (Divide):** Sıralanacak diziyi ortadan ikiye bölerek iki alt dizi oluşturur.
2. **Yeniden Düzenleme (Conquer):** Her iki alt diziyi ayrı ayrı sıralar. Eğer alt diziler daha küçük boyutta değilse, bölme adımı tekrarlanır.
3. **Birleştirme (Merge):** Sıralı alt dizileri birleştirerek orijinal diziyi oluşturur.

Bu adımlar, alt dizilerin sıralı bir şekilde birleştirilmesi sayesinde orijinal dizinin sıralanmış halini elde etmeyi sağlar. Merge sort, özellikle büyük veri setleri üzerinde etkili bir şekilde çalışan **kararlı (stable)** bir sıralama algoritmasıdır. Kararlılık, aynı değere sahip öğelerin sıralama sonrasında orijinal sıralama sırasını korumasını ifade eder.

Merge sort'un zaman karmaşıklığı O(n log n) olup, bu, algoritmanın büyük veri setlerinde etkili bir şekilde çalışabilmesini sağlar. Ancak, ekstra bellek kullanımı nedeniyle bazı durumlarda tercih edilmeyebilir.

## Programın Amacı

Program ilk olarak çalışanın özniteliklerini içeren bazı değerleri nesnesine atar ve her bir öznitelik başlığına göre sıralama işlemini gerçekleştirir. Tüm sıralama işlemi Türkçe alfabetik sıraya göre yapılır.

## Depoda Bulunan Dosyalar

- `src`
  - `MergeSortExample`
    - `model`
      - `Employee.java`
    - `util`
      - `DefineValues.java`
      - `ShowProcess.java`
    - `mergesort`
      - `MergeSortEmployee.java`
    - `Main.java`
    - `MergeSort.java`


## Dosya Açıklaması

| Dosya Adları                | Bilgi                                                   |
|-----------------------------|---------------------------------------------------------|
| MergeSortEmployee.java      | MergeSort Sıralama İşlemini Türkçe alfabetik sıraya göre uygulama |
| Employee.java               | POJO olarak tanımlama                                   |
| Main.java                   | Programı çalıştırmak ve test etmek için dosya           |
| ShowProcess.java            | Çalışan nesnesi hakkındaki tüm bilgileri çıktı olarak gösterme |
| DefineValues.java           | Niteliklerinin çalışan nesnesine doldurulması           |


[![mergesortexample](https://r.resimlink.com/pJaUXHFK12Cj.png)](https://resimlink.com/pJaUXHFK12Cj)
