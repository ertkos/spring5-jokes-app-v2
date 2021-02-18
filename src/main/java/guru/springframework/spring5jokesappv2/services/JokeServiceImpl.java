package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotesLocal chuckNorrisQuotesLocal;

    public JokeServiceImpl(ChuckNorrisQuotesLocal chuckNorrisQuotesLocal) {
        this.chuckNorrisQuotesLocal = chuckNorrisQuotesLocal;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotesLocal.getRandomQuote();
    }
}
