CC = gcc
CFLAGS = -Wall -O2

TARGET = sorting
SRC = main.c geracao.c selection_sort.c bubble_sort.c insertion_sort.c quick_sort.c merge_sort.c

all: $(TARGET)

$(TARGET): $(SRC)
	$(CC) $(CFLAGS) -o $(TARGET) $(SRC)

run: $(TARGET)
	./$(TARGET)

clean:
	rm -f $(TARGET)
