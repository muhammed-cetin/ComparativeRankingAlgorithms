# Insertion Sort Example

Insertion sort, sıralama algoritmalarından biridir ve sıralanan bölümü bir eleman ekleyerek genişletme (insertion) prensibine dayanır. Bu algoritma, dizinin başlangıcından itibaren elemanları tek tek alır ve her bir elemanı uygun konumuna yerleştirir. Insertion sort, adım adım bir sıralama işlemi gerçekleştirir ve bir elemanın yerleştirilmesi sırasında önceki sıralı bölümü kaydırmaz, sadece yeni elemanın doğru konumunu bulur ve ekler.

## Adımlar

1. **Başlangıç Durumu:**
   İlk eleman, sıralı bölüm olarak düşünülür ve bu bölüm yalnızca bir eleman içerir.

2. **Eleman Ekleme:**
   Sıralı bölümdeki elemanlardan biri, sırayla, sıralı bölüme yeni bir eleman eklenene kadar devam edilir.

3. **Yerine Koyma:**
   Yeni eleman, sıralı bölümdeki elemanlarla karşılaştırılır ve uygun konumuna yerleştirilir. Bu işlem, yeni elemanın doğru konumunu bulana kadar devam eder.

4. **Tekrarlama:**
   Diğer elemanlar için de aynı işlemler tekrarlanır, böylece sıralı bölüm adım adım genişler.

5. **Sıralı Diziyi Gösterme:**
   Tüm elemanlar sıralı bölüme eklenip yerleştirildikten sonra, dizinin sıralı hali elde edilir.

Insertion sort, küçük veri setlerinde ve nispeten sıralı olan dizilerde etkili bir şekilde çalışabilir. Ancak, zaman karmaşıklığı bakımından O(n^2) olması, büyük veri setleri için diğer sıralama algoritmalarının tercih edilmesine neden olabilir.

## Programın Amacı

Bu program, kullanıcının girdiği diziyi Insertion Sort algoritması kullanarak sıralar ve sıralama öncesi/sonrası durumları ekrana yazdırır. Insertion Sort, bir elemanı sıralı bölüme ekleyerek çalışan bir algoritmadır ve bu program da bu algoritmayı uygular.

## Depoda Bulunan Dosyalar

- `src`
  - `InsertionSort`
    - `InsertionSort.java`

## Dosya Açıklaması

| Dosya Adları                | Bilgi                                                   |
|-----------------------------|---------------------------------------------------------|
| InsertionSort.java          | Programı çalıştırmak ve test etmek için dosya           |


[![insertionsortexample](https://r.resimlink.com/ODvnGNZ2RW.png)](https://resimlink.com/ODvnGNZ2RW)
