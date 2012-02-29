(meditations
  "You can create a set in two ways"
  (= #{} (set nil)) ; set creates a new set containing all the elements of the argument. No elements in this argument.

  "They are another important data structure in clojure"
  (= 3 (count #{1 2 3})) ; Simple counting

  "Remember that a set is a 'set'"
  (= #{1 2 3 4 5} (set '(1 1 2 2 3 3 4 4 5 5))) ; No duplicates in a set

  "You can ask clojure for the union of two sets"
  (= #{1 2 3 4 5} (clojure.set/union #{1 2 3 4} #{2 3 5}))  ; Simple union

  "And also the intersection"
  (= #{2 3} (clojure.set/intersection #{1 2 3 4} #{2 3 5}))

  "But don't forget about the difference"
  (= #{1 4} (clojure.set/difference #{1 2 3 4 5} #{2 3 5})))
