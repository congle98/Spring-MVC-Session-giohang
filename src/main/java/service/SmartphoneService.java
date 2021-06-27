package service;

import model.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ISmartphoneRepository;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository smartPhoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartPhoneRepository.deleteById(id);
    }

    @Override
    public void update(long id, Smartphone smartphone) {
        smartphone.setId(new Long(id));
        smartPhoneRepository.save(smartphone);
    }
}
