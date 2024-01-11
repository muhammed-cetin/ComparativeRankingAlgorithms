# Heap Sort Example

Heap Sort, bir sıralama algoritmasıdır ve temel olarak bir heap veri yapısını kullanarak çalışır. Heap, bir tamamen sıralı ağaç yapısını temsil eden bir veri yapısıdır. Heap Sort, aşağıdaki adımları takip eder:

1. **Heapify (Heap Oluşturma):** Verilen diziyi, bir max heap veya min heap haline getirir. Max heap'te her düğüm, çocuklarından daha küçük veya eşit, min heap'te ise her düğüm çocuklarından daha büyük veya eşit olmalıdır.

2. **Sıralama:** Heap oluşturulduktan sonra, her seferinde heap'ın kökündeki eleman ile dizinin sonundaki elemanın yerini değiştirir. Bu işlem sonucunda dizinin sonundaki eleman sıralı bölüme eklenir ve heap'ın boyutu bir azaltılır. Bu adım, heap boşaldığında tamamlanır.

Heap Sort'un zaman karmaşıklığı O(n log n) olarak bilinir. Bu, algoritmanın orta büyüklükteki veri setlerinde etkili bir şekilde çalışmasını sağlar. Heap Sort, in-place bir sıralama algoritmasıdır, yani ekstra bellek kullanımı minimaldir. Ancak, bubble sort gibi basit algoritmaların karmaşıklığına göre daha yüksektir.

## Programın Amacı

Heap sort algoritması kullanılarak bir diziyi sıralama amacını taşır. 

## Depoda Bulunan Dosyalar

- `src`
  - `HeapSort`
    - `HeapSort.java`

## Dosya Açıklaması

| Dosya Adları                | Bilgi                                                   |
|-----------------------------|---------------------------------------------------------|
| HeapSort.java               | Programı çalıştırmak ve test etmek için dosya           |


[![heapsortexample](https://r.resimlink.com/JkG-Xo.png)](https://resimlink.com/JkG-Xo)
