# Note: All refactored code placed in `refactored` package


# Notes for refactored code:

1. Moved reading file to separate util class
2. Added handling exceptions
3. Moved getting words in separate util class
4. Removed unnecessary sorting of words
5. Added filtering of empty string and trim
6. Rewritten all logic for counting and grouping words, which decreased total exec time in 10 times
   (1200ms vs 120vs in average on my local machine)
7. Added util class for measuring execution time of passed method 
