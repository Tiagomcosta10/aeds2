class SelectionSort extends Geracao {

   public SelectionSort(int tamanho){
      super(tamanho);
   }

   @Override
   public void sort(){
      for (int i = 0; i < n-1; i++){
         int min = i;
         for (int j = i+1; j < n; j++){
            if (array[j] < array[min]){
               min = j;
            }
         }
         swap(i, min);
      }
   }
}
