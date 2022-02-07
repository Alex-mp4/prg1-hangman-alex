# Hangman, prg1 | Post Mortem 

Alexander Donev Heino, TE20 - 2022-02-07

## Inledning

Detta projekt handlade om att skapa det populära, samt simpla, spelet "Hänga Gubbe" (eng, "Hangman"). Spelet går ut på att gissa ett ord där man endast vet antalet bokstäver. Varje gång man gissar rätt bokstav ser man tydligt vilken position som tillhör bokstaven, vilket i sin tur gör det lättare att fortsätta att hitta resten av ordet. Det är det första riktiga programmet vi har skapat med en början och slut samtidigt som den används för att bevisa våra förmågor inom programmering inom de fundamentala byggstenarna av Java + metoder. 

## Bakgrund

Det första jag gjorde var att förstå uppgiften och programmet i det mest simpla sätt möjligt. Med hjälp av en hemsida vid namn app.diagrams.net skapade jag ett diagram som gick igenom alla möjliga utfall programmet borde ha. Den gick inte in på detaljer alls, utan visade endast med hjälp av enkla prompter, så som; Händer det här eller inte (ja/nej). Främst gjorde jag detta för att inte komplicera tänken alltför mycket till att börja med.

![Plan](https://cdn.discordapp.com/attachments/813684682867867658/932570710734409788/unknown.png)

Därefter började jag planera självaste programmerings delarna av projektet. Alltså vilka bitar kommer jag behöva använda för att skapa programmet. På så sätt kunde jag förstå när vilka bitar av koden skulle användas, exempelvist for- och while-loopar, under utvecklingensgång. Med detta i åtanke slippte jag att pausa kodningen för att lista ut vad man ska göra därnäst. Jag kodade genom att det lätta och förståeliga först och sedan gick in på detaljerna. Till exempel skapade jag alla funktioner som gör det grundläggande först. Som att göra om bokstäver till understräck medans jag senare fixade vinst och förlust situationer, vilket var det som krävde lite mer "fine tuning" jämförelsevist. 

## Positiva erfarenheter

I sin helhet var projektet faktiskt underhållande att utveckla och dessutom var det kul att sätta sina färdigheter på prov. Att bli nöjd med resultatet är alltid en positiv sak. Mycket av koden är egengjord med all kunskap jag har fått, men ifall det fanns någonting mer komplicerat som behövdes kunde jag alltid söka fram en lösning. I de flesta fall kunde jag helt enkelt analysera min kod för att feltesta när jag fastnade. Jag inbillade mig vad en input gjorde i programmet när jag behövde hitta ett problem. Programmet hann bli klart och fungerar som ett spel vem som helst hade kunnat spela utan dessvärre bekymmer.

## Negativa erfarenheter

Det fanns ett ställe i programmet där jag fastnade lite för länge. Prompten i "else if" satsen gick igenom många iterationer innan det faktiskt funkade. Men under ett toabesök fick jag en brainblast och fixade hela grejen sekunder senare. Helt ärligt borde jag ha frågat för hjälp lite tidigare men det kändes bra att lösa problemet själv. Dock är väl koden inte "upp till standard" på grund av avsaknaden av metoder, någonting vi egentligen ska skriva alla funktioner som. Nästa gång borde jag fokusera på metoder istället för rader på rader av kontinuerlig kod. Det gör inte någon speciell skillnad i utförandet, men koden blir "bättre" och mer förståelig.

## Sammanfattning

För att sammanfatta blev jag väldigt nöjd med slutprodukten. Koden funkar och det finns inga fel. Jag lyckades lösa alla problem själv vilket bevisar en grad av att jag har förstått det vi har hållit på med. Dock borde jag tänka mer på metoder tills nästa gång för att göra koden lättare, på ett sätt. Det finns vissa utvecklingar man kan göra på programmet. Exempelvist, ASCII-konst som en UI. Nu säger den bara hur många försök man har kvar istället för att visa någonting konkret.
