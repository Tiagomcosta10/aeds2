class BubbleSort extends Geracao {

   public BubbleSort(int tamanho){
      super(tamanho);
   }

   @Override
   public void sort(){
      for (int i = 0; i < n-1; i++){
         for (int j = 0; j < n-i-1; j++){
            if (array[j] > array[j+1]){
               swap(j, j+1);
            }
         }
      }
   }
}
