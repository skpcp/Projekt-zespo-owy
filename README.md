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
*/saveTicketWithAttachments* | Save ticket with attachments | Pozwala na zapisanie zgłoszenia wraz z załącznikiem. Zapisu dokonujemy przez wpisanie: attachments (załącznika po przez jego numer id), description (opis), kind (prbolem), priority (priorytet), project (projekt), type (typ), user (użytkownik). Zgłoszenia może dokonać admin lub advanced_user. Przy zapisie zgłoszenia musi zostać podany projekt do którego jest dokonywane zgłoszenie a także priorytet. Numer id jest nadawany automatycznie i nie trzeba go podawać. Typ może być wewnetrzny lub zewnetrzny zależy czy chcemy aby zwykły użytkownik to widział. Problem może być typu zgloszenie, sugestia, blad. W przypadku popełnienia błędu zostanie pokazany odpowiedni komunikat.
*/saveTicket* | Save ticket | Pozwala na zapisanie zgłoszenia po przez podanie: description (opis), kind (prbolem), priority (priorytet), project (projekt), type (typ), user (użytkownik). Procedura zapisu wygląda tak jak przy przypadku zapisu z załącznikiem tylko tu go nie dodajemy.
*/removeTicketById* | Delete ticket | Umożliwia usunięcie zgłoszenia po przez podanie numeru id zgłoszenia, które chcemy usunąć. Pole id jest kluczem głónym wyszukiwania co świadczy o tym że nie może być puste. Jeżeli nic w nie wpiszemy pole zostanie pogrubione czerwonym prostokątem. W przypadku popełnienia innego błędu system wyświetli odpowiedni komunikat o błędzie.
*/getTicketstByUser* | Find tickets by user | Wyszukanie za pomocą numeru id użytkownika, który dodał zgłoszenie. Pole id jest polem obowiązkowym i nie może zostać puste. Brak jego pokaże nam system. Inne błędy będą obsługiwane przez odpowiednie komunikaty. Jeżeli będzie wszystko dobrze zostanie pokazane zgłoszenie lub zgłoszenia dodane przez użytkownika, którego numer id został użyty do wyszukiwania.
*/getTicketsByProject* | Find tickets by project | Wyszukanie za pomocą numeru id projektu, z którym zostało dodane zgłoszenie. Pole id jest polem obowiązkowym i nie może zostać puste. Brak jego pokaże nam system. Inne błędy będą obsługiwane przez odpowiednie komunikaty. Jeżeli będzie wszystko dobrze zostanie pokazane zgłoszenie przypisane do odpowiedniego numeru id projektu.
*/getTicketsByPriority* | Find tickets by priority | Pozwala odszukać zgłoszenia za pomocą numeru id priorytetu. Pole to jest polem kluczowym i musi być wypełnione. Jego brak zostanie zaznaczony. Inne błędy zostaną pokazane przez odpowiednie komunikaty. Po wyszukiwaniu zostaną pokazane te projekty, które mają przypisany numer id priorytetu.
*/getByType* | Find ticket by type | Wyszukiwanie obsługuje dwa typy. Do wyboru mamy 'WEWNETRZNY' lub 'ZEWNETRZNY'. Jeżeli zostanie popełniony jakiś błąd będzie to wyświetlone. Po poprawnym wyszukiwaniu zostaną pokazane zgłoszenia przypisane do odpowiedniego typu.
*/getByKind* | Find ticket by ticket type | Wyszukiwanie obsługuje trzy typy. Do wyboru mamy 'ZGLOSZENIE', 'SUGESTIA' lub 'BLAD'. Jeżeli zostanie popełniony jakiś błąd będzie to wyświetlone. Po poprawnym wyszukiwaniu zostaną pokazane zgłoszenia przypisane do odpowiedniego typu problemu. 
*/getById* | Find ticket by id | Umożliwia wyszukanie zgłoszenia po przez numer id. Pole to jest konieczne i nie może zostać puste. W przypadku popełnienia jakiegoś błędu system pokaże nam komunikat o nim. Po znalezieniu wpisanego id zostanie pokazane przypisane do niego zgłoszenie.
*/getAll* | Find all tickets | Umożliwia wyświetlenie wszystkich zgłoszeń w systemie. Nie posiada żadnych pól kluczowych.
*/addHistoryToTicket* | Update ticket history | Umożliwia zapisanie histori do zgłoszenia. Przy zapisie tym podajemy w polu history numer id histori i do pola id numer id zgłoszenia. Po przez wykonanie tej operacji zostanie zapisana historia do danego zgłoszenia. Jeżeli popełnimy jakiś błąd system pokaże nam odpowiedni komunikat.
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
*/removeProject* | Delete project by id | Pozwala na usunięcie projektu po przez podanie numeru id. Pole to jest polem kluczowym i nie może zostać puste. Jeżeli nie zostanie wypełnione system nam to pokaże. Jeżeli będzie inny błąd na ekranie zostanie pokazany odpowiedni komunikat co zrobiliśmy źle. Po wykonaniu operacji projekt zostanie na stałe usunięty.
*/getByPriority* | Find project by priority | Pozwala na wyszukanie projektu za pomocą pola priority.name (nazwa priorytetu). Pole jest niezbędne do tego wyszukiwania. Jego brak zaznaczy nam system i każe je uzupełnić. Po wyszukaniu zostaną pokazane projekty, które mają przypisany wyszukiwany priorytet. Jeżeli zostanie popełniony błąd zostanie pokazany odpowiedni komunikat o błędzie.
*/getByName* | Find project by name | Pozwoli nam znaleść projekt o odpowowiadającej nazwie do nazwy wyszukiwania. Pole name (nazwa) nie może zostać puste ponieważ jest kluczem. O braku wypełnienia poinformuje nas system przez zaznaczenie tego pola. Inne błędy będą informowane przez odpowiednie komunikaty. Po znalezieniu szukanego projektu zostaną wyświetlone informacje o nim.
*/getById* | Find project by id | Wyszukanie za pomocą numeru id projektu. Jedynym polem wyszukiwania jest id, które nie może zostać puste. Brak wypełnienia zostanie zaznaczony. Popełnienie innego błędu będzie skutkowało pokazaniem odpowiedniego komunikatu. Jeżeli wyszukiwanie zakończy się sukcesem zostanie pokazany odpowiedni projekt z jego informacjami.
*/getAll* | Find all project | Umożliwia wyświetlenie wszystkich projektów w systemie. Nie posiada żadnych pól kluczowych. 
*/changeNameForProject* | Update project name | Pozwala na zmianę nazwy projektu po przez podanie numeru id a także nazwy pole (name). Nazwa zostanie zmieniona dla projektu, któremu odpowiada podany numer id. W przypadku błędu system nam to pokaże odpowiedni komunikat.
</br>

e)Priority controller

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 
*/savePriority* | Save priority | Pozwala na utworzenie nowego priorytetu. W czasie jego tworzenia podajemy: name (nazwę) oraz responseTime (czas oczekiwania). Podczas tworzenia nowego priorytetu najważniejsze jest podanie czasu oczekiwania ponieważ to on okreąl nam czas oczekiwania na rozpatrzenie usterki. Jeżeli w trakcie twożenia zostanie popełniony jakiś błąd system wyświetli odpowiedni komunikat.
*/removePriority* | Delete priority | Pozwala na usunięcie priorytetu po przez podanie numeru id. Pole to jest polem kluczowym i nie może zostać puste. Jeżeli nie zostanie wypełnione system nam to pokaże. Jeżeli będzie inny błąd na ekranie zostanie pokazany odpowiedni komunikat co zrobiliśmy źle. Po wykonaniu operacji priorytet zostanie na stałe usunięty.
*/getProitiesById* | Find priority by id | Wyszukanie za pomocą numeru id priorytetu. Jedynym polem wyszukiwania jest id, które nie może zostać puste. Brak wypełnienia zostanie zaznaczony. Popełnienie innego błędu będzie skutkowało pokazaniem odpowiedniego komunikatu. Jeżeli wyszukiwanie zakończy się sukcesem zostanie pokazany odpowiedni priorytet.
*/getByName* | Find priority by name | Pozwoli nam znaleść priorytet o odpowowiadającej nazwie do nazwy wyszukiwania. Pole name (nazwa) nie może zostać puste ponieważ jest kluczem. O braku wypełnienia poinformuje nas system przez zaznaczenie tego pola. Inne błędy będą informowane przez odpowiednie komunikaty. 
*/getAll* | Find all priorities | Umożliwia wyświetlenie wszystkich prirytetów w systemie. Nie posiada żadnych pól kluczowych. 
*/changePriorityName* | Update priority name | Pozwala na zmianę nazwy priorytetu po przez podanie numeru id a także nazwy pole (name). Nazwa zostanie zmieniona dla priorytetu, któremu odpowiada podany numer id. W przypadku błędu system nam to pokaże odpowiedni komunikat.
</br>

f)Permissions controller 

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 
*/savePermissions* | Save permission | Pozwala na zapisanie nowego pozwolenia(permission). Aby to zrobić należy podać nazwę tworzonego pozwolenia. Nie trzeba podawać numeru id ponieważ jest on zmieniany automatycznie. W przypdaku popełnienia jakiegoś błędu zostanie pokazany odpowiedni komunikat.
*/removePermissionById* | Delete permission | Pozwala na usunięcie pozwolenia za pomocą numeru id. Pole to jest kluczowe i nie może zostać usunięte. Brak jego wypełnienia pokaże nam system. Inne błędy będą pokazywane przez odpowiednie komunikaty. Jeżeli wszystko będzie dobrze pozwolenie zostanie usunięte na stałe.
*/getByName* | Find permission by name | Pozwoli nam znaleść pozwolenie po odpowowiadającej nazwie do nazwy wyszukiwania. Pole name (nazwa) nie może zostać puste ponieważ jest kluczem. O braku wypełnienia poinformuje nas system przez zaznaczenie tego pola. Inne błędy będą informowane przez odpowiednie komunikaty.
*/getById* | Find permission by id | Wyszukanie za pomocą numeru id pozwolenia. Jedynym polem wyszukiwania jest id, które nie może zostać puste. Brak wypełnienia zostanie zaznaczony. Popełnienie innego błędu będzie skutkowało pokazaniem odpowiedniego komunikatu. Jeżeli wyszukiwanie zakończy się sukcesem zostanie pokazany odpowiednie pozwolenie.
*/getAll* | Find all permission | Umożliwia wyświetlenie wszystkich pozwoleń w systemie. Nie posiada żadnych pól kluczowych.
</br>

g)History controller 

Metoda | Funkcjonalość | Opis
 --- | --- | --- 
*/saveHistoryWithAttachments* | Save history with attachments | Umożliwia utworzenie histori wraz z załącznikiem. Podczas wyszukiwania wpisujemy: attachments (załącznik, jego numer id), description (opis), type (typ, może być wewnętrzny lub zewnetrzny), user (użytkownik, nie może być zwykłym użytkownikiem systemu). Pole id jest dodawne automatycznie i nie trzeba go wpisywać. Jeżeli wystąpi błąd system nam to pokaże.
*/saveHistory* | Save history | Pozwala na zapisanie histori tak jak w przypadku jak wyżej ale bez konieczności dodawania załącznika. Jaki kolwiek błąd zostanie pokazany przez system.
*/removeHistoryById* | Delete history | Pozwala na usunięcie historii za pomocą numeru id. Pole to jest kluczowe i nie może zostać usunięte. Brak jego wypełnienia pokaże nam system. Inne błędy będą pokazywane przez odpowiednie komunikaty. Jeżeli wszystko będzie dobrze historia zostanie usunięte na stałe.
*/getByUserAndDate* | Find by user and date | Pozwala na wyszukanie historii za pomocą pól date (data utworzenia) i user.id (numer id użytkownika). Pola te są kluczowe i muszą być wypełnione. Jaki kolwiek brak, którego z kolwiek zostanie polazany przez system. Inne błędy zostaną pokazane przez odpowiednie komunikaty. Gdy wszystko będzie ok zostanie pokazana historia utworzona przez danego użytkownika w danym dniu.
*/getByUser* | Find history by user | Umożliwia wyszukanie historii po przez podanie user.id (numer id użytkownika). Pole to jest kluczem tego wyszukiwania i nie może zostać puste. Jeżeli zostanie popełniony inny błąd zostanie wyświetlony odpowiedni komunikat. Po zakończonym wyszukiwaniu zostanie pokazana historia stworzona przez odpowiedniego użytkownika.
*/getById* | Find history by id | Umożliwia wyszukiwanie historii po przez podanie jej numeru id. Pole id jest polem obowiązkowym i musi być wpisane. Jeżeli zostanie popełniony inny błąd zostanie nam to pokazane w odpowiednim komunikacie. Gdy wyszukanie zostanie zakończone pokazana zostanie historia przypisana do odpowiedniego numeru id.
*/getByDate* | Find history by date | Pozwala na zanlezienie histori za pomocą daty kiedy została utowrzona. Pole date (data) jest obowiązkowe i musi być wypełnione. Inny błąd także zostanie pokazany przez odpowiedni komunikat. 
*/getAll* | Find all history | Umożliwia wyświetlenie wszystkich pozwoleń w systemie. Nie posiada żadnych pól kluczowych. 
</br>

h)Binary controller

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 
*/saveBinary* | Save binary | Pozwala na zapisanie danych pliku w postaci binarnej. 
*/removeBinaryById* | Delete binary | Pozwala na trwałe usunięcie binari. Można tego dokonać za pomocą numeru id. Pole to jest potrzebne do wykonania operacji i nie może być puste. 
*/getBinaryById* | Find binary by id | Pozwala na znalezienie odpowiedniego binaria za pomocą jego numeru id. Pole id jest kluczem wyszukiwania i musi być wpisane. Brak pokaże nam system. Inne błędy będą obsługiwane przez odpowiednie komunikaty. 
*/getAllBinaries* | Find all binary | Umożliwia wyświetlenie wszystkich pozwoleń w systemie. Nie posiada żadnych pól kluczowych.
</br> 

i)Attachment controller 

Metoda | Funkcjonalność | Opis 
 --- | --- | --- 
*/saveAttachment* | Save attachment | Aby dodać załącznik trzeba podać następujące pola: binary (wpisujemy id binaria do pliku, musi być wcześniej utworzone), file_name (nazwa pliku jaki zostanie przesłany przez załącznik), mine_type (wpisujemy własny typ problemu do załanczanego pliku), name (nazwa załącznika) oraz type (typ załącznika wewnetrzny lub zewnetrzny). Jedynym polem jakiego nie trzeba wpisywać jest id ponieważ nadawane jest automatycznie. Jeżeli zostanie popełniony jakiś błąd zostanie on pokazany przez odpowiedni komunikat. Po załączeniu załącznika zostaną pokazane informacje do niego przypisane.
*/removeAttachmentById* | Delete attachment | Pozwala na usunięcie załącznika po przez podanie jego numeru id. Pole w czasie usuwania jest konieczne i nie może pozostać puste. Jego brak zostanie zaznaczony. Pozostałe błędy obsługują komunikaty. Po dobrym wykonaniu operacji załącznik zostanie usunięty na stałe.
*/getByType* | Find attachment by type | Pozwala  na znalezienie załącznika za pomocą typu (pole type). W czasie tego wyszukiwania mamy do wyboru dwie opcjie wewnetrzny lub zewnetrzny. Jeżeli będzie jakiś błąd zostanie pokazany przez system na ekranie.
*/getByName* | Find attachment by name | Umożliwia wyszukiwanie za pomocą nazwy załącznika (pole name). Pole to jest obowiązkowe co na to wskazuje musi być uzupełnione. Jeżeli w trakcie zostanie popełniony jakiś błąd zostanie pokazany odpowiedni komunikat.
*/getByMineTypeAndName* | Find aatachment by mine type and name | Pozwala na wyszukanie załącznika za pomocą dwóch pól kluczowych. Polami tymi są mine_type (mój typ) i name (nazwa załącznika). Pola te muszą zostać podane. Jeżeli będą puste wyszukiwanie nie odbędzie się. Inne błedy obsłógują komunikaty.
*/getByMineType* | Find attachments by mine type | Pozwala na znalezienie załącznika za pomocą pola mine_typ (typu wpisywanego przez użytkownika co jest nie tak z załącznikiem). Pole to jest nie zbędne do przeprowadzenia wyszukiwania a więc nie może pozostać puste. Jeżeli nie zostanie wpisane system nam to pokaże. Jeżeli popełnimy inny błąd system nam pokaże to w odpowiednim komunikacie.
*/getByFileName* | Find attachments by file name | Możemy tu szukać załącznika za pomocą nazwy pliku (file_name). Pole to jest kluczowe wieć nie może być puste. Jeżeli pozostawimy je puste wyszukiwanie nie zacznie się. Jeżeli zostanie popełniony inny błąd system nam to pokaże co za tym idzie trzeba będzie poprawić wpisaną dane. 
*/getAttachmentById* | Find attachmetn by id | Umożliwia wyszukiwanie załącznika po przez podanie jego numeru id. Pole id jest polem obowiązkowym i musi być wpisane. Jeżeli zostanie popełniony inny błąd zostanie nam to pokazane w odpowiednim komunikacie. Gdy wyszukanie zostanie zakończone pokazany zostanie załącznik przypisana do odpowiedniego numeru id. 
*/getAllAtachments* | Find attachments | Umożliwia wyświetlenie wszystkich załączników w systemie. Nie posiada żadnych pól kluczowych.
</br> 





