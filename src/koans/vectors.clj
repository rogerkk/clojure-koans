(meditations
  "You can use vectors in clojure to create an 'Array' like structure"
  (= 1 (count [42]))  ; Counts elements of vector - 1 element

  "You can create a vector in several ways"
  (= [] (vec nil))  ; Creates a new vector containing the contents of the argument  

  "And populate it in either of these ways"
  (= [1] (vec '(1))) ; As above

  "There is another way as well"
  (= [nil] (vector nil)) ; So vector is not the same as vec. vector takes the arguments (0 to n arguments) and use those directly as content. How intuitive.. ;)

  "But you can populate it with any number of elements at once"
  (= [1 2] (vec '(1 2))) ; vec adds content of argument

  "And add to it as well"
  (= [333] (conj (vec nil) 333)) ; vec first creates an empty vector, then we conjugate 333 to this vector.

  "You can get the first element of a vector like so"
  (= :peanut (first [:peanut :butter :and :jelly])) ; Like we do for lists.

  "And the last in a similar fashion"
  (= :jelly (last [:peanut :butter :and :jelly])) ; Like we do for lists

  "Or any index if you wish"
  (= :jelly (nth [:peanut :butter :and :jelly] 3)) ; get the item indexed by the number 3

  "You can also slice a vector"
  (= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))  ; start is inclusive, end is exclusive. Awkward.

  "Equality with collections is in terms of values"
  (= (list 1 2 3) (vector 1 2 3))) ; OK.
