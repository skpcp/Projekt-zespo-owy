# Projekt-zespolowy
Projekt zespołowy UWM - Programiści </br>
Aplikacja o błędach </br>
Aplikacja umożliwiająca wysyłanie przez klientów błędów dla wielu systemów. Głównym celem aplikacji będzie rozwiązywanie nadesłanych błędów systemowych. Klient będzie mógł zgłosić błąd na podstawie jednego z czterech priorytetów. Priorytetami tymi są: </br>
-Trywialny - Są to drobne błędy, często nawet niezauważalne dla użytkowników korzystających z aplikacji. Dla przykładu: brakujące przecinki, drobne błędy wizualne (lekkie przesunięcia) etc. </br>
-Bloker - Jest to błąd utrudniający poprawne korzystanie z systemu. Dla przykładu w e-sklepie nie można posortować produktów po cenie rosnąco, działa tylko opcja malejąca. Oczywiście użytkownik sobie poradzi ale wpłynie to negatywnie na wygodę korzystania z narzędzia. </br>
-Ważny - Jest to błąd znacząco utrudniający prace aplikacji. Dla przykładu: w e-sklepie nie działa opcja płatności on-line (jedna z wielu). Użytkownik może zakończyć transakcje ale jest zmuszony wybrać inną opcję płatności. </br>
-Krytyczny - Jest to błąd uniemożliwiający realizację podstawowych funkcjonalności aplikacji. Dla przykładu: w e-sklepie nie działa proces zamawiania produktu. </br> 

Zgłoszenie błędu z danym priorytetem wiązało się będzie z określonym czasem naprawy system. I tak: </br>
-Jeżeli użytkownik zgłosi problem o charakterze trywialnym naprawa może potrwać do maksymalnie 14 dni ponieważ nie jest to błąd nie umożliwiający na działanie całego systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakterze blokera naprawa może potrwać maksymalnie do 10 dni ponieważ błąd w nie znaczny sposób przeszkadza w prawidłowym działaniu systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakteże awari naprawa potrwa do 5 dni ponieważ w sposób znaczący utrudnia działanie systemu. </br>
-Jeżeli użytkownik zgłosi problem o charakteże krytycznym awaria zostanie naprawiona w jak najszybyszm czasie gdyż błąd uniemożliwia całkowite działanie systemu. </br>

W aplikacji możemy wyróżnić dwa rodzaje użytkowników: </br>
-Zewnętrznych - są to użytkownicy, którzy nadsyłają problemu z aplikacjiami do rozwiązania. </br>
-Wewnętrzny - są to róznego rodzaju testerzy odpowiedzialni za werfikacje nadesłanych błędów a także sprawdzenie po naprawie czy wszystko działa poprawnie. Innym rodzajem tego typu użytkownika może być programista, który jest odpowiedzialny za naprawę nadesłanych aplikacji. </br> 

Podczas zgłaszania błedu użytkownik wraz z określeniem typu błędu dodatkowo będzie musiał zamieścić opis błędu "co w systemie jest nie tak". To co zgłasza użytkownik w systemie nazwywane jest jako zgłoszenie zewnętrzne. Dodatkowo będzie mógł nadesłać zrzut ekranu obrazujący dany błąd systemu. Po zgłoszeniu błędu otrzyma komunikat o tym że awaria została przyjęta i czeka na werfikacje. Błędy przesłane przez użytkowników są sprawdzane przez odpowiednich testerów, którzy werifkują nadesłaną przez użytkownika awarie. Podczas werfikacji sprawdzane jest czy błąd spowodownay jest z winy aplikacji czy też z innego powodu. Określa on rodzaj błędu i kieruje do odpowiedniego miejsca gdzie awaria zostanie usunięta. Użytkownik, który dokonuje zgłoszenia otrzymuje wiadomość o czasie naprawy. Po zakończeniu testów dokonywane jest zgłoszenie wewnętrzne, które wykonywane jest w celu naprawy odpowiedniego błędu systemu. W czasie naprawy programista może dodawać komentarze wewnętrzne, które pokażą w przyszłości jeżeli zajdzie ponowna konieczność naprawy co robił. Komentarze te nie będą widzoczne dla użytkownika który zgłasza problem. Po naprawieniu błędu aplikacja zostaje skierowana do testera, który sprawdza poprawności działania systemu. Po sprawdzeniu jeżeli jest wszystko dobrze i nie zostały wykryte żadne błędy aplikacja wraca do klienta. Wraz z działającym systemem użytkownik otrzymuje komentarze zewnętrzne na temat tego co został naprawione w aplikacji oraz opisy żeczy poprawionych. </br>

Schemat bazy danych: </br>
![alt text](https://github.com/skpcp/Projekt-zespolowy/blob/master/shcemat%20bazy%20danych%20projekt%20zespolowy.jpg) </br>

<b> Serwisy: </b> </br> 

a)User Controller: </br>

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 
*/saveUser* | Save user | Funkcjonalność przeznaczona do tworzenia nowych użytkowników lub do edycji istniejących. W czasie tworzenia użytkownika trzeba uzupełnić pewne niezbędne pola, które są wymagane podczas tworzenia nowego użytkownika. Polami tymi są: email, login, md5pass, name, surname. Login i md5pass są polami przez, które użytkownik będzie logował się do aplikacji. 
*/removeUserById* | Delete user | Pozwala na usunięcie użytkownika po przez podanie jego numeru id. Pole id jest polem kluczowym i musi zostać wypełnione. Nie może być puste inaczej nasza operacja nie zostanie wykonana. W przypadku popełnienia błędu system zwróci nam odpowieni komunikat.
*/getBySurname* | Find user by surname | Umożliwia nam wyszukanie użytkowników systemu po przez wpisanie nazwiska użytkownika (surname). Podczas wyszukiwania po nazwisku pole surname jest polem obowiązkowym do wpisania. Jeśli tego nie zrobimy to pole zostanie przemienione na czerwony prostokąt, sygnalizujący że nic nie zostało wpisane. Jeżeli zaś wpiszemy nazwisko, którego nie ma w systemie zostanie nam wyświetlony komunikat o błędzie. Gdy użytkownik zostanie znaleziony system wyświetli nam informacje, które zostały podane podczas tworzenia użytkownika, a także inne informacje dotyczące użytkownika.
*/getByRole* | Find users by role | Pozwala wyświetlić nam urzytkowników za pomocą ich roli (role.name). Nazwa roli jest polem kluczowym i musi być wypełnione. Brak tego pola pokaże nam system. Jeżeli popełnimy błąd system pokaże odpowiedni komunikat dotyczący danego błędu. 
*/getByNameAndSurname* | Find users by name and surname | Wyszukanie użytkownika podobnie jak inne funkcjonalności znajduje nam użytkownika. Różnicą jest sposób wyszukiwania naszego użytkownika. W tym przypadku znajdujemy go po przez podanie imienia i nazwiska w pola wymagane. Pola kluczowe to name (imię) i surname (nazwisko). Gdy dane te nie zostaną wprowadzone lub jedno z pól nie zostanie wprowadzone to odpowiednie pole lub oba zostaną objęte czerwonym prostokątem. Jeżeli dane zostaną źle wprowadzone zostanie pokazayny komunikat o błędzie jaki nastąpił. Jeżeli wyszukanie powiedzie się zostaną wyświetlone wszystkie dane odpowiedniego użytkownika, które zostały podane podczas tworzenia jego konta, a także inne informacje dotyczące użytkownika. 
*/getByName* | Find users by name | Funkcjonalność działająca w podobny sposób do innych opierających się na znajdowaniu użytkownika. W tym przypadku użytkownika możemy znaleźć po jego imieniu (name). Pole to jest kluczowe w tym wyszukiwaniu i musi być uzupełnione, nie może zostać puste. Jeżeli jest puste mamy komunikat o jego wypełnieniu. Jeżeli wpiszemy imię użytkownika, które nie pasuje do żadnego naszego pracownika dane nie zostaną wyświetlone. Po znalezieniu użytkownika bądź kilku użytkowników (kilka osób może mieć to samo imię) zostaną wyświetlone ich dane.
*/getByLogin* | Find user by login | Pozwala wyszukać danego użytkownika za pomocą loginu (login). Jest to pole kluczowe naszego wyszukiwania więc nie może być ono puste. Jeśli zostanie nie wpisane system nam to pokaże. Jeżeli popełnimy inny błąd system wyświtli nam odpowiedni komunikat. Jeżeli wyszukanie się powiedzie zostanie wyświetlony użytkownik przypisany do szukanego loginu. 
*/getById* | Find user by id | Funkcjonalność należąca do najlepszego typu gdyż każdy użytkownik ma swój nie powtarzalny numer id, który go identyfikuje. Polem kluczowym jest id, które musi zostać podane w czasie wyszukiwania. Jeżeli nie ma konta przypisanego do wpisanego numeru id nic nie zostanie wyświetlone. Po znalezieniu naszego użytkownika który ma przypisany id zostaną wyświetlone jego dane.
*/getByEmail* | Find user by email |  Pozwala wyszukać danego użytkownika za pomocą emailu. Jest to pole kluczowe naszego wyszukiwania więc nie może być ono puste. Jeśli zostanie nie wpisane system nam to pokaże. Jeżeli popełnimy inny błąd system wyświtli nam odpowiedni komunikat. Po znalezieniu odpowiedniego użytkownika system pokaże nam informacje on nim zawarte w systemie. 
*/getAll* | Find all users | Funkcjonalność umożliwiająca pokazanie nam wszystkich użytkowników jakich mamy utworzonych w systemie. Po wyszukaniu użytkowników zostaną wyświetlone ich wszystkie dane.
*/changeUserRole* | Change user role | Pozwala na zmianę roli użytkownika w systemie. Aby to wykonać należy wpisać numer id użytkownika, któremu chcemy zmienic rolę a następnie nazwę nowej roli. Spowoduje to aktualizacjię roli naszego użytkownika.
*/changeLogin* | Update user login | Pozwala na zmianę loginu użytkownika. Aby to zrobić w pole login wpisujemy nowy login i numer id użytkownika dla którego adres jest zmieniany. Jeżeli popełnimy jakiś błąd system pokaże nam odpowiedni komunikat. Jeżeli wszystko będzie wporządku system wykona żądaną operacje. 
*/changeEmail* | Update user email | Pozwala na zmianę adresu mailowego użytkownika. Aby to zrobić musimy podać numer id użytkownika a następnie jego nowy mail (pole email). Jeżeli popełnimy błąd system nam pokaże odpowiedni komunikat. Jeżeli wszystko będzie zrobione poprawnie mail zostanie zmieniony.
</br>

b)Ticket controller

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 

</br>
c)Role controller 

Metoda | Funkcjonalość | Opis
 --- | --- | ---
*/getByName* | Find role by name | Umożliwia wyszukanie roli po przez pole nazwa (name). Pole to jest pole kluczowym w tym przypadku wyszukiwania i nie może pozostać puste. W przypadku braku jego wypełnienia system upomni się o to. Jeżeli popełnimy jakiś błąd otrzymamy odpowiedni komunikat zwrotny. Wraz z wyszukaniem roli podane zostaną jej informacje.
*/getById* | Find role by id | Umożliwia wyszukanie roli po przez numer id. Pole to jest konieczne i nie może zostać puste. W przypadku popełnienia jakiegoś błędu system pokaże nam komunikat o nim. Po znalezieniu wpisanego id zostanie pokazana przypisana do niego rola.
*/getAll* | Find all role | Umożliwia wyświetlenie wszystkich roli w systemie. Nie posiada żadnych pól kluczowych. 
*/removeRoleById* | Delete role | Umożliwia usunięcie roli po przez podanie numeru id roli, którą chcemy usunąć. Pole id jest kluczem głónym wyszukiwania co świadczy o tym że nie może być puste. Jeżeli nic w nie wpiszemy pole zostanie pogrubione czerwonym prostokątem. W przypadku popełnienia innego błędu system wyświetli odpowiedni komunikat o błędzie. 
</br>

d)Project controller 

Metoda | Funkcjonalonść | Opis 
 --- | --- | --- 
*/saveProject* | Save project | Pozwala na utworzenie nowego projektu. W czasie jego tworzenia podajemy: description (opis), name (nazwę), priority (priorytet), version (wersje). Podczas tworzenia nowego projektu najważniejsze jest dodanie do niego opisu, ponieważ sugeruje nam o co w nim chodzi. Podczas tworzenia musi zostać podany odpowiedni proirytet. Bez niego nie zostanie utworzony projekt. Informacje o rozpatrzeniu projektu będą podane w opisie priorytetu. Jeżeli w trakcie twożenia zostanie popełniony jakiś błąd system wyświetli odpowiedni komunikat.
*/removeProject* | Delete project by id | Pozwala na usunięcie projektu po przez podanie numer id. Pole to jest polem kluczowym i nie może zostać puste. Jeżeli nie zostanie wypełnione system nam to pokaże. Jeżeli będzie inny błąd na ekranie zostanie pokazany odpowiedni komunikat co zrobiliśmy źle. Po wykonaniu operacji projekt zostanie na stałe usunięty.
*/getByPriority* | Find project by priority | Pozwala na wyszukanie projektu za pomocą pola priority.name (nazwa priorytetu). Pole jest niezbędne do tego wyszukiwania. Jego brak zaznaczy nam system i każe je uzupełnić. Po wyszukaniu zostaną pokazane projekty, które mają przypisany wyszukiwany priorytet. Jeżeli zostanie popełniony błąd zostanie pokazany odpowiedni komunikat o błędzie.
*/getByName* | Find project by name | Pozwoli nam znaleść projekt o odpowowiadającej nazwie do nazwy wyszukiwania. Pole name (nazwa) nie może zostać puste ponieważ jest kluczem. O braku wypełnienia poinformuje nas system przez zaznaczenie tego pola. Inne błędy będą informowane przez odpowiednie komunikaty. Po znalezieniu szukanego projektu zostaną wyświetlone informacje o nim.
*/getById* | Find project by id | Wyszukanie za pomocą numeru id projektu. Jedynym polem wyszukiwania jest id, które nie może zostać puste. Brak wypełnienia zostanie zaznaczony. Popełnienie innego błędu będzie skutkowało pokazaniem odpowiedniego komunikatu. Jeżeli wyszukiwanie zakończy się sukcesem zostanie pokazany odpowiedni projekt z jego informacjami.
*/getAll* | Find all project | Umożliwia wyświetlenie wszystkich projektów w systemie. Nie posiada żadnych pól kluczowych. 
*/changeNameForProject* | Update project name | Pozwala na zmianę nazwy projektu po przez podanie numeru id a także nazwy pole (name). Nazwa zostanie zmieniona dla projektu, któremu odpowiada podany numer id. W przypadku błędu system nam to pokaże nam odpowiedni komunikat.
</br>


