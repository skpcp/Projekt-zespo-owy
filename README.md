# Projekt-zespolowy
Projekt zespołowy UWM - Programiści </br>
Aplikacja o błędach </br>
Aplikacja umożliwiająca wysyłanie przez klientów błędów dla wielu systemów. Głównym celem aplikacji będzie rozwiązywanie nadesłanych błędów systemowych. Klient będzie mógł zgłosić błąd na podstawie jednego z czterech priorytetów. Priorytetami tymi są: </br>
-Trywialny - Są to drobne błędy, często nawet niezauważalne dla użytkowników korzystających z aplikacji. Dla przykładu: brakujące przecinki, drobne błędy wizualne (lekkie przesunięcia) etc. </br>
-Bloker - Jest to błąd utrudniający poprawne korzystanie z systemu. Dla przykładu w e-sklepie nie można posortować produktów po cenie rosnąco, działa tylko opcja malejąca. Oczywiście użytkownik sobie poradzi ale wpłynie to negatywnie na wygodę korzystania z narzędzia. </br>
-Awaria - Jest to błąd znacząco utrudniający prace aplikacji. Dla przykładu: w e-sklepie nie działa opcja płatności on-line (jedna z wielu). Użytkownik może zakończyć transakcje ale jest zmuszony wybrać inną opcję płatności. </br>
-Krytyczny - Jest to błąd uniemożliwiający realizację podstawowych funkcjonalności aplikacji. Dla przykładu: w e-sklepie nie działa proces zamawiania produktu. </br> 

Zgłoszenie błędu z danym priorytetem wiązało się będzie z określonym czasem naprawy system. I tak: </br>
-Jeżeli użytkownik zgłosi problem o charakterze trywialnym naprawa może potrwać do maksymalnie 14 dni ponieważ nie jest to błąd nie umożliwiający na działanie całego systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakterze blokera naprawa może potrwać maksymalnie do 10 dni ponieważ błąd w nie znaczny sposób przeszkadza w prawidłowym działaniu systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakteże awari naprawa potrwa do 5 dni ponieważ w sposób znaczący utrudnia działanie systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakteże krytycznym awaria zostanie naprawiona w jak najszybyszm czasie gdyż błąd uniemożliwia całkowite działanie systemu. </br>

Podczas zgłaszania błedu użytkownik wraz z określeniem typu błędu dodatkowo będzie musiał zamieścić opis błędu "co w systemie jest nie tak". Dodatkowo będzie mógł nadesłać zrzut ekranu obrazujący dany błąd systemu. Po zgłoszeniu błędu otrzyma komunikat o tym że awaria została przyjęta i czeka na werfikacje. Błędy przesłane przez użytkowników są sprawdzane przez odpowiedni testerów, którzy werifkują nadesłaną przez użytkownika awarie. Podczas werfikacji sprawdzane jest czy błąd spowodownay jest z winy aplikacji czy też z innego powodu. Określa on rodzaj błędu i kieruje do odpowiedniego miejsca gdzie awaria zostanie usunięta. Po sprawdzeniu nadesłanej wiadomości użytkownik dostaje informacje w jakim czasie awaria zostanie usunięta. Po naprawieniu błędu aplikacja zostaje skierowana do testera, który sprawdza poprawności działania systemu. Po sprawdzeniu jeżeli jest wszystko dobrze i nie zostały wykryte żadne błędy aplikacja wraca do klienta. 

