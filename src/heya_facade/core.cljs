(ns heya-facade.core
  (:require
   [reagent.core :as r]
   [reagent.dom :as d]
   [lambdaisland.fetch :as fetch]))

;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 {:class "text-lg font-medium"} "Hello World!"]])

(+ 1 1)
;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
