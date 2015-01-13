(ns clj-beautify.core
  (:require [clj-beautify.file-handler :refer [list-files]])
  (:gen-class))

(defn -main
  "Entry point of the command line program.
   (0 args) -> represents the mode to open the program in (clj or edn)
   (1 args) -> represents the file or directory to walk for formatting"
  [& args]
  (println args)
  (let [arg-cnt (count args)]
    (when (< 2 arg-cnt)
      (throw (Exception. (str "Invalid number of arguements. Expected 2 but "
                              "found " arg-cnt))))
    ;; TODO: do something with the valid args
    (let [files (list-files (nth args 1))]
      (println files))))
